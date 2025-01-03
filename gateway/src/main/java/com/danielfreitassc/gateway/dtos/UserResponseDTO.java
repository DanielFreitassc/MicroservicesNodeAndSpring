package com.danielfreitassc.gateway.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import com.danielfreitassc.gateway.models.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;

public record UserResponseDTO(
    UUID id,
    String name,
    String username,
    UserRole role,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDateTime createdAt
) {
    
}
