package com.example.tjscsoapclient.service.mapper;

import com.example.tjscsoapclient.domain.RequestClient;
import com.example.tjscsoapclient.domain.ResponseClient;

public interface ClientMapper<R extends RequestClient, RequestTjSc extends Object, S extends ResponseClient, ResponseTjSc extends Object> {

    RequestTjSc clientToTjSc(R request);

    S tjScToClient(ResponseTjSc responseTjSc);

}
