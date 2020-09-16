package com.example.EmployeeAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeeAPI.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

}
