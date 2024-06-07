package com.pratham.springBoot.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.pratham.springBoot.dto.EmployeeDTO;
import com.pratham.springBoot.entities.EmployeeEntity;
import com.pratham.springBoot.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = new ModelMapper();
    }

    public EmployeeDTO getEmployeeById(Long id) {
        // EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return modelMapper.map(employeeRepository.getById(id), EmployeeDTO.class);
    }

    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity), EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> list = new ArrayList<>();
        for (EmployeeEntity employeeEntity : employeeRepository.findAll()) {
            EmployeeDTO map = modelMapper.map(employeeEntity, EmployeeDTO.class);
            list.add(map);
        }
        return list;
    }
}
