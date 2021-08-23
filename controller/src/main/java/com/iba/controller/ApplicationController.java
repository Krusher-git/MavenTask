package com.iba.controller;

import com.iba.dto.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ApplicationController {

    ResponseEntity<List<UserDTO>> getAllUsers();

}
