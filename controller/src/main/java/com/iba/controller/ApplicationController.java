package com.iba.controller;

import com.iba.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/module")
public interface ApplicationController {

    @GetMapping()
    ResponseEntity<List<UserDTO>> getAllUsers();

}
