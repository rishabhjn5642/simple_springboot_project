package com.example.rishabh.controllor;


import com.example.rishabh.model.EmployeeRequestDTO;
import com.example.rishabh.model.EmployeeResponseDTO;
import com.example.rishabh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeControllor {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public EmployeeResponseDTO getDetails()
    {
        return null;
    }

    @GetMapping("/getEmployee/{id}")
    public EmployeeResponseDTO getDetailId(Long id)
    {
        return  null;
    }

    @PostMapping("/add")
    public EmployeeResponseDTO postDetails(@RequestBody EmployeeRequestDTO employeeRequestDTO)
    {
        return employeeService.createEmployee(employeeRequestDTO);

    }

}
