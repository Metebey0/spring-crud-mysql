package com.example.jpamysql.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jpamysql.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
