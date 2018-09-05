package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.picknroll.web.dao.ServiceCategoryDao;
import com.picknroll.web.entity.ServiceCategory;

@Repository
public class MybatisServiceCategoryDao implements ServiceCategoryDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(ServiceCategory serviceCategory) {
		return 0;
	}

	@Override
	public int update(ServiceCategory serviceCategory) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public ServiceCategory get(String id) {
		return null;
	}

	@Override
	public List<ServiceCategory> getList() {
		return null;
	}

}
