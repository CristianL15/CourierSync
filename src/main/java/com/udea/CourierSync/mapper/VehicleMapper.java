package com.udea.CourierSync.mapper;

import com.udea.CourierSync.DTO.VehicleDTO;
import com.udea.CourierSync.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
  VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);
	VehicleDTO toDTO(Vehicle entity);
	Vehicle toEntity(VehicleDTO dto);
}

