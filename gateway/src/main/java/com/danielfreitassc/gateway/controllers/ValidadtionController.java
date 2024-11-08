package com.danielfreitassc.gateway.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitassc.gateway.dtos.ValidationResponseDTO;
import com.danielfreitassc.gateway.services.ValidationService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("validation")
@RequiredArgsConstructor
public class ValidadtionController {
    private final ValidationService validationService;


    @GetMapping
    public ResponseEntity<ValidationResponseDTO> valitation(HttpServletRequest request) {
        return validationService.validate(request);
    }
}
