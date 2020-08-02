package com.example.rishabh.service;

import com.example.rishabh.model.EmployeeRequestDTO;
import com.example.rishabh.model.EmployeeResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeService {


    public EmployeeResponseDTO createEmployee(EmployeeRequestDTO employeeRequestDTO);


}
