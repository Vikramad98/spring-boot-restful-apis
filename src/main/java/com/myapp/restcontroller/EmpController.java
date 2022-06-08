package com.myapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.model.Employee;
import com.myapp.service.EmployeeService;

@CrossOrigin
@RequestMapping("/employees")
@RestController
public class EmpController {
	
	public EmpController(){
		System.out.println("#### EmpController Created ####");
	}
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public List<Employee> addEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
		return employeeService.findAllEmployees();
	}
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.findAllEmployees();
	}
}
