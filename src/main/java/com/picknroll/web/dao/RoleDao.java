package com.picknroll.web.dao;

import java.util.List;

import com.picknroll.web.entity.Role;

public interface RoleDao {
	
	int insert(Role role);

	int update(Role role);

	int delete(String id);

	Role get(String id);

	List<Role> getList();
	
}