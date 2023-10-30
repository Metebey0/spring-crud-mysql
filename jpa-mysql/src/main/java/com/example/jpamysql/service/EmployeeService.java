package com.example.jpamysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpamysql.dao.EmployeeDao;
import com.example.jpamysql.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Iterable<Employee> getEmployee(){
		return employeeDao.findAll();
	}
	
	public Employee getEmployeeById(Integer id) {
		return employeeDao.findById(id).orElse(new Employee());
	}
	
	public Employee createEmployee(Employee emp) {
		return employeeDao.save(emp);
	}
	
	public Employee updateEmployee(Employee emp) {
		return employeeDao.save(emp);
	}
	
	public void deleteEmployee(Integer id) {
		employeeDao.deleteById(id);
	}
}
