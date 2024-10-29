package com.danielfreitassc.gateway.mappers;

import org.mapstruct.Mapper;

import com.danielfreitassc.gateway.dtos.AuthenticationDTO;
import com.danielfreitassc.gateway.models.UserEntity;

@Mapper(componentModel = "spring")
public interface AuhtenticationMapper {

    AuthenticationDTO toDto(UserEntity user);
    UserEntity toEntity(AuthenticationDTO authenticationDTO);  
}