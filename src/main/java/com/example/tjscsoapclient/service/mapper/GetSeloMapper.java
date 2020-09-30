package com.example.tjscsoapclient.service.mapper;

import br.jus.tjsc.selo.SeloRoot;
import com.example.tjscsoapclient.domain.getselo.response.SeloResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",  uses = {SeloMapper.class})
public interface GetSeloMapper extends EntityMapper<SeloRoot, SeloResponse> {

    @Mappings({
            @Mapping(source="messageId", target="messageID"),
            @Mapping(source="selos", target="selos.selo"),
    })
    SeloRoot toDto(SeloResponse entity);


    @InheritInverseConfiguration
    SeloResponse toEntity(SeloRoot dto);



}
