package com.example.rishabh.service.impl;

import com.example.rishabh.dao.service.EmployeeDaoService;
import com.example.rishabh.model.EmployeeRequestDTO;
import com.example.rishabh.model.EmployeeResponseDTO;
import com.example.rishabh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDaoService employeeDaoService;

    @Override
    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO employeeRequestDTO) {
        return employeeDaoService.saveEmployee(employeeRequestDTO);
    }
}
