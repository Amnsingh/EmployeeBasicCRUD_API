package com.example.EmployeeAPI.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeAPI.DAO.EmployeeDAO;
import com.example.EmployeeAPI.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	public EmployeeDAO employeeDAO;
/*	List<Employee> employee;
	public EmployeeServiceImpl() {
		employee =  new ArrayList<>();
		employee.add(new Employee(0001,"Aman","Singh","ASE"));
		employee.add(new Employee(0100,"Tom","Alter","Manager"));
	}*/

	@Override
	public List<Employee> findAllEmployees() {
//		return employee;
		return employeeDAO.findAll();
	}

	@Override
	public Employee findOneEmployee(int id) {
/*		Employee e=null;
		for(Employee emp:employee) {
			if(emp.getId()==id) {
				e=emp;
				break;
			}
		}
		return e;*/
		return employeeDAO.getOne(id);
	}

	@Override
	public void addOneEmployee(Employee emp) {
//		employee.add(emp);
		employeeDAO.save(emp);
	}

	@Override
	public Employee updateOneEmployee(Employee emp) {
		
		return employeeDAO.save(emp);
	}

	@Override
	public void deleteCourse(int empId) {

		employeeDAO.deleteById(empId);
	}
	
	

}
