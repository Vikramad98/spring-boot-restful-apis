package com.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.model.Role;

@Service
public interface RoleService {
	List<Role> findAllRoles();
	boolean AddRole(Role role);
}
