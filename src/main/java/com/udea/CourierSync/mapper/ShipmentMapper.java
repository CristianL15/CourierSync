package com.udea.CourierSync.mapper;

import com.udea.CourierSync.DTO.ShipmentDTO;
import com.udea.CourierSync.entity.Shipment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {ClientMapper.class, PackageMapper.class, VehicleMapper.class})
public interface ShipmentMapper {
    ShipmentMapper INSTANCE = Mappers.getMapper(ShipmentMapper.class);
	ShipmentDTO toDTO(Shipment entity);
	Shipment toEntity(ShipmentDTO dto);
}

