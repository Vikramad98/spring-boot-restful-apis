package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.model.Role;
import com.myapp.repository.RoleRepository;

@Service("RoleServiceImpl")
public class RoleServiceImpl implements RoleService {

	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public boolean AddRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role)==role;
	}

	@Override
	public List<Role> findAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
