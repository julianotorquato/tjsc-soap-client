package com.example.tjscsoapclient.service;


import br.jus.tjsc.selo.SeloRoot;
import br.jus.tjsc.selo.SeloService_Service;
import com.example.tjscsoapclient.config.ApplicationProperties;
import com.example.tjscsoapclient.domain.getselo.response.SeloResponse;
import com.example.tjscsoapclient.service.mapper.GetSeloMapper;
import com.example.tjscsoapclient.service.util.Base64Utils;
import com.example.tjscsoapclient.service.util.XmlUtils;
import org.springframework.stereotype.Service;

@Service
public class SeloService {

    private final ApplicationProperties applicationProperties;
    private final GetSeloMapper seloMapper;

    public SeloService(ApplicationProperties applicationProperties, GetSeloMapper seloMapper) {
        this.applicationProperties = applicationProperties;
        this.seloMapper = seloMapper;
    }

    public SeloResponse requestSelo() throws Exception{
        SeloService_Service seloService_service = new SeloService_Service();
        byte[] body = seloService_service.getSeloServicePort().getSelos(applicationProperties.getUsername(), applicationProperties.getPassword());
        SeloRoot seloRoot = XmlUtils.convertXmlToObject(Base64Utils.convertToString(body), SeloRoot.class);
       return seloMapper.toEntity(seloRoot);

    }

}
