package com.example.rishabh.dao.repository;

import com.example.rishabh.dao.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

  Optional<Employee> findByName(String name);

}
