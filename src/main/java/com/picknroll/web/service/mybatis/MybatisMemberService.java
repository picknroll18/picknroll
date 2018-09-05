package com.picknroll.web.service.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picknroll.web.dao.MemberDao;
import com.picknroll.web.entity.Member;
import com.picknroll.web.service.MemberService;

@Service
public class MybatisMemberService implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Override
	public int insert(Member member) {
		return memberDao.insert(member);
	}

	@Override
	public int update(Member member) {
		return memberDao.update(member);
	}

	@Override
	public int delete(String id) {
		return memberDao.delete(id);
	}

	@Override
	public Member get(String id) {
		return memberDao.get(id);
	}

	@Override
	public List<Member> getList() {
		return memberDao.getList();
	}

	@Override
	public List<Member> getList(int page) {
		return memberDao.getList(page);
	}

	@Override
	public List<Member> getList(String field, String query) {
		return memberDao.getList(field, query);
	}

	@Override
	public List<Member> getList(String field, String query, int page) {
		return memberDao.getList(field, query, page);
	}

}