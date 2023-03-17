package com.example.crmapp.dao;

import com.example.crmapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByFirstNameAsc();
}
