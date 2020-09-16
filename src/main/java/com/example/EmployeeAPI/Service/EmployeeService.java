package com.example.EmployeeAPI.Service;

import java.util.List;

import com.example.EmployeeAPI.model.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployees();

	public Employee findOneEmployee(int id);

	public void addOneEmployee(Employee emp);

	public Employee updateOneEmployee(Employee emp);

	public void deleteCourse(int empId);
	
}
