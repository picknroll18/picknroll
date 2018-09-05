package com.picknroll.web.dao;

import java.util.List;

import com.picknroll.web.entity.ServiceCategory;

public interface ServiceCategoryDao {

	int insert(ServiceCategory serviceCategory);

	int update(ServiceCategory serviceCategory);

	int delete(String id);

	ServiceCategory get(String id);

	List<ServiceCategory> getList();
	
}
