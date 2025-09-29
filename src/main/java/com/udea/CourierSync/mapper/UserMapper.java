package com.udea.CourierSync.mapper;

import com.udea.CourierSync.DTO.UserDTO;
import com.udea.CourierSync.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	UserDTO toDTO(User entity);
	User toEntity(UserDTO dto);
}