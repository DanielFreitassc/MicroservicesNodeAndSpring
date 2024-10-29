package com.danielfreitassc.gateway.mappers;

import org.mapstruct.Mapper;

import com.danielfreitassc.gateway.dtos.UserDTO;
import com.danielfreitassc.gateway.dtos.UserResponseDTO;
import com.danielfreitassc.gateway.models.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(UserEntity userEntity);
    UserEntity toEntity(UserDTO userDTO);

    UserResponseDTO toResponseDto(UserEntity userEntity);
}
