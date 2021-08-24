package com.iba.controller.impl;

import com.iba.controller.ApplicationController;
import com.iba.dto.UserDTO;
import com.iba.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ApplicationControllerImpl implements ApplicationController {

    private final ApplicationService service;

    @Override
    public ResponseEntity<List<UserDTO>> getAllUsers() {

        List<UserDTO> users = service.getAllUsers();

        return ResponseEntity
                .ok()
                .body(users);
    }

}
