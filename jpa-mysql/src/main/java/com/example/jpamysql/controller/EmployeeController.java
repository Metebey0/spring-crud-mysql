package com.example.jpamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpamysql.model.Employee;
import com.example.jpamysql.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/getAllEmployee")
	public Iterable<Employee> getAllEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping(value="/getEmployeeById/(id)")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping(value="/createEmployee")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.createEmployee(emp);
	}
	
	@PutMapping(value="/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}
	
	@DeleteMapping(value="/deleteEmployee/(id)")
	public void deleteEmployee(@PathVariable("id") Integer id) {
		employeeService.deleteEmployee(id);
	}
}
