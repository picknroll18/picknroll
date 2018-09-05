package com.picknroll.web.dao;

import java.util.List;

import com.picknroll.web.entity.Service;

public interface ServiceDao {

	int insert(Service service);

	int update(Service service);

	int delete(String id);

	Service get(String id);

	List<Service> getList();
	
}
