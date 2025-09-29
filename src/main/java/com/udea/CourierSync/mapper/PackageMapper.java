package com.udea.CourierSync.mapper;

import com.udea.CourierSync.DTO.PackageDTO;
import com.udea.CourierSync.entity.Package;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PackageMapper {
    PackageMapper INSTANCE = Mappers.getMapper(PackageMapper.class);
	PackageDTO toDTO(Package entity);
	Package toEntity(PackageDTO dto);
}

