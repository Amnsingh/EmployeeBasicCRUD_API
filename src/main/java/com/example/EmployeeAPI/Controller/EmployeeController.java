package com.example.EmployeeAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeAPI.Service.EmployeeService;
import com.example.EmployeeAPI.model.Employee;

@RestController
@RequestMapping("/api/vi")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return this.employeeService.findAllEmployees();
	}
	@GetMapping("/employee/{empId}")
	public Employee getOneEmployee(@PathVariable int empId) {
		return this.employeeService.findOneEmployee(empId);
	}
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee emp) {
		this.employeeService.addOneEmployee(emp);
	}
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return this.employeeService.updateOneEmployee(emp);
	}
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int empId){
		try {
			this.employeeService.deleteCourse(empId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
