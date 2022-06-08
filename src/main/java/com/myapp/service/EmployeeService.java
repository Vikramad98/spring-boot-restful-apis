package com.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.model.Employee;


public interface EmployeeService {

	List<Employee> findAllEmployees();
	
	boolean addEmployee(Employee employee);
}
