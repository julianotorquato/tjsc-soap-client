package com.example.tjscsoapclient.service.mapper;

import br.jus.tjsc.selo.MessageSelos;
import br.jus.tjsc.selo.SeloRoot;
import com.example.tjscsoapclient.domain.getselo.response.Selo;
import com.example.tjscsoapclient.domain.getselo.response.SeloResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",  uses = {})
public interface SeloMapper extends EntityMapper<MessageSelos.Selo, Selo> {

    @Mappings({
            @Mapping(source="numeroSerie", target="numeroSerie"),
    })
    MessageSelos.Selo toDto(Selo entity);


    @InheritInverseConfiguration
    Selo toEntity(MessageSelos.Selo dto);



}
