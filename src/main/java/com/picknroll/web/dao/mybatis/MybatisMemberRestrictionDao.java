package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.picknroll.web.dao.MemberRestrictionDao;
import com.picknroll.web.entity.MemberRestriction;

@Repository
public class MybatisMemberRestrictionDao implements MemberRestrictionDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(MemberRestriction memberRestriction) {
		return 0;
	}

	@Override
	public int update(MemberRestriction memberRestriction) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public MemberRestriction get(String id) {
		return null;
	}

	@Override
	public List<MemberRestriction> getList() {
		return null;
	}

}
