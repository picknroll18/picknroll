package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.picknroll.web.dao.MemberRoleDao;
import com.picknroll.web.dao.RoleDao;
import com.picknroll.web.entity.Role;

@Repository
public class MybatisRoleDao implements RoleDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(Role role) {
		RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
		return roleDao.insert(role);
	}

	@Override
	public int update(Role role) {
		RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
		return roleDao.update(role);
	}

	@Override
	public int delete(String id) {
		RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
		return roleDao.delete(id);
	}

	@Override
	public Role get(String id) {
		RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
		return roleDao.get(id);
	}

	@Override
	public List<Role> getList() {
		RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
		return roleDao.getList();
	}

}
