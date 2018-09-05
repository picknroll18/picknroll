package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.picknroll.web.dao.ServiceDao;
import com.picknroll.web.entity.Service;

@Repository
public class MybatisServiceDao implements ServiceDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(Service service) {
		return 0;
	}

	@Override
	public int update(Service service) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public Service get(String id) {
		return null;
	}

	@Override
	public List<Service> getList() {
		return null;
	}

}
