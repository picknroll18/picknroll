package com.picknroll.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.picknroll.web.dao.MemberDao;
import com.picknroll.web.entity.Member;

public class MyBatisMemberDao implements MemberDao {
	
/*	@Autowired
	private SqlSession sqlSession;*/

	@Override
	public int insert(Member member) {
/*		MemberDao memberDao = sqlSession.getMapper(MemberDao.class);
		return memberDao.insert(member);*/
		return 0;
	}

	@Override
	public int update(Member member) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

	@Override
	public Member get(String id) {
		return null;
	}

	@Override
	public List<Member> getList() {
		return null;
	}

	@Override
	public List<Member> getList(int page) {
		return null;
	}

	@Override
	public List<Member> getList(String field ,String query) {
		return null;
	}

	@Override
	public List<Member> getList(String field ,String query, int page) {
		return null;
	}

}
