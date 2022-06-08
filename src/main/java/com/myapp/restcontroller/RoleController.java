package com.myapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.model.Role;
import com.myapp.service.RoleService;

@CrossOrigin
@RequestMapping("/roles")
@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping
	public List<Role> getAllRoles(){
		return roleService.findAllRoles();
	}
	
	@PostMapping
	public List<Role> createRole(@RequestBody Role role){
		roleService.AddRole(role);
		return roleService.findAllRoles();
	}
}
