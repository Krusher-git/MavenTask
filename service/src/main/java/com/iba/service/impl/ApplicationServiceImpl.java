package com.iba.service.impl;

import com.iba.dto.ApplicationModelMapper;
import com.iba.dto.UserDTO;
import com.iba.entity.UserEntity;
import com.iba.repository.ApplicationRepository;
import com.iba.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository repository;
    private final ApplicationModelMapper mapper;

    public List<UserDTO> getAllUsers() {
        List<UserEntity> entities = repository.findAll();
        return mapper.mapToDTO(entities);
    }
}
