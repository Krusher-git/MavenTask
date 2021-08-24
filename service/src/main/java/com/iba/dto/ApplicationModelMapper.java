package com.iba.dto;

import com.iba.entity.UserEntity;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class ApplicationModelMapper {

    private final ModelMapper modelMapper;

    public List<UserDTO> mapToDTO(List<UserEntity> entities) {

        List<UserDTO> usersDTO = entities
                .stream()
                .map(entity -> modelMapper.map(entity, UserDTO.class))
                .collect(Collectors.toList());

        return usersDTO;
    }

    public List<UserEntity> mapToEntity(List<UserDTO> usersDTO) {

        List<UserEntity> entities = usersDTO
                .stream()
                .map(userDTO -> modelMapper.map(userDTO, UserEntity.class))
                .collect(Collectors.toList());

        return entities;
    }

}
