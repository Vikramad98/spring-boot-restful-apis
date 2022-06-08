package com.myapp.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.myapp.model.Employee;
import com.myapp.repository.EmployeeRepository;
import com.myapp.service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
class EmpControllerTest {

	@Mock
	private EmployeeRepository repository;
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@Test
	public void getEmployees_test_valid() {
		List<Employee> employees=new ArrayList<>();
		Employee employee=new Employee();
		employee.setId(1);
		employee.setfName("Vikram");
		employee.setlName("Gaikwad");
		
		employees.add(employee);
		when(repository.findAll()).thenReturn(employees);
		Assertions.assertEquals(employees, repository.findAll());
	}
	

}
