package com.example.rishabh.dao.service.impl;

import com.example.rishabh.dao.entity.Employee;
import com.example.rishabh.dao.service.EmployeeDaoService;
import com.example.rishabh.model.EmployeeRequestDTO;
import com.example.rishabh.model.EmployeeResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rishabh.dao.repository.EmployeeRepo;

@Service
public class EmployeeDaoServiceImpl implements EmployeeDaoService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO employeeRequestDTO) {

        Employee employee = new Employee();




        if (employeeRepo.findByName(employeeRequestDTO.getName()).isPresent())
        {
            throw new RuntimeException("name already exists");
        }

        employee.setName(employeeRequestDTO.getName());
        employee.setSalary(employeeRequestDTO.getSalary());



        Employee e = employeeRepo.save(employee);

        EmployeeResponseDTO employeeResponseDTO = new EmployeeResponseDTO();
        employeeResponseDTO.setId(employee.getId());

        employeeResponseDTO.setName(employee.getName());
        employeeResponseDTO.setSalary(employee.getSalary());

        return employeeResponseDTO;
    }
}
