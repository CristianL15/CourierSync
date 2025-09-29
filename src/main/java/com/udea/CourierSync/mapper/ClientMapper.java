package com.udea.CourierSync.mapper;

import com.udea.CourierSync.DTO.ClientDTO;
import com.udea.CourierSync.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {
  ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
	ClientDTO toDTO(Client entity);
	Client toEntity(ClientDTO dto);
}

