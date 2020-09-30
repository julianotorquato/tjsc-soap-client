package com.example.tjscsoapclient.service.client;

import com.example.tjscsoapclient.config.ApplicationProperties;
import com.example.tjscsoapclient.domain.RequestClient;
import com.example.tjscsoapclient.domain.ResponseClient;
import com.example.tjscsoapclient.service.mapper.ClientMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.client.support.interceptor.PayloadValidatingInterceptor;

import javax.xml.bind.JAXBIntrospector;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public abstract class AbstractSoapClient<R extends RequestClient, S extends ResponseClient> extends WebServiceGatewaySupport {

    private static final String PACKAGE_BASE = "br.jus.tjsc.selo";
    //private static final String DIR_WSD_SELO = "wsdl/v3.0/xsSeloDigital.xsd";
    //private static final String DIR_WSD_SELO = "wsdl/v3.0/SeloService30.xsd";
    private static final String DIR_WSD_SELO = "wsdl/v3.0/SeloMaster.xsd";


    protected final ApplicationProperties properties;

    public AbstractSoapClient(ApplicationProperties properties) {
        this.properties = properties;
//
//        this.configureUri();
//        this.configureMarshaller();
//        this.configureInterceptors();
    }

//    public S executeRequest(R request, ClientMapper mapper) {
//        Object requestClient = mapper.clientToTjSc(request);
//
//        Object responseClient = (Object) getWebServiceTemplate().marshalSendAndReceive(null, new WebServiceMessageCallback() {
//            @Override
//            public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException { }
//
//        });
//        Object value = JAXBIntrospector.getValue(responseClient);
//        return (S) mapper.tjScToClient(value);
//    }


    protected void configureMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(PACKAGE_BASE);
        this.setMarshaller(marshaller);
        this.setUnmarshaller(marshaller);
    }

    protected void configureUri() {
        this.setDefaultUri(this.properties.getTjscWebserviceUri());
    }

    protected void configureInterceptors() {
        PayloadValidatingInterceptor validation = new PayloadValidatingInterceptor();
        validation.setSchemas(new ClassPathResource(DIR_WSD_SELO));
        validation.setValidateRequest(Boolean.TRUE);
        validation.setValidateResponse(Boolean.FALSE);
        try {
            validation.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClientInterceptor[] interceptors = new ClientInterceptor[1];
        interceptors[0] = validation;

        this.setInterceptors(interceptors);
    }

}
