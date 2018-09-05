package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.picknroll.web.dao.MemberServiceDao;
import com.picknroll.web.entity.MemberService;

@Repository
public class MybatisMemberServiceDao implements MemberServiceDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insert(MemberService memberService) {
		return 0;
	}

	@Override
	public int update(MemberService memberService) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public MemberService get(String id) {
		return null;
	}

	@Override
	public List<MemberService> getList() {
		return null;
	}

}
