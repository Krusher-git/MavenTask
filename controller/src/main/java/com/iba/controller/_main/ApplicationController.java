package com.iba.controller._main;

import com.iba.dto.UserDTO;
import com.iba.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ApplicationController {

    private final ApplicationService service;


    @GetMapping("/module")
    public ResponseEntity<List<UserDTO>> getAllUsers() {

        return ResponseEntity.of(Optional.of(service.getAllUsers()));
    }


}
