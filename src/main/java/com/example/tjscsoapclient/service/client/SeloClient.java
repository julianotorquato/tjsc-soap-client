package com.example.tjscsoapclient.service.client;

import com.example.tjscsoapclient.config.ApplicationProperties;
import com.example.tjscsoapclient.domain.ResponseClient;
import com.example.tjscsoapclient.domain.getselo.SeloRequest;
import org.springframework.stereotype.Component;

@Component
public class SeloClient extends AbstractSoapClient<SeloRequest, ResponseClient> {

    public SeloClient(ApplicationProperties properties) {
        super(properties);
    }

}