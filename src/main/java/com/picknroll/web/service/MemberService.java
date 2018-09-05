package com.picknroll.web.service;

import java.util.List;

import com.picknroll.web.entity.Member;

public interface MemberService {

	int insert(Member member);

	int update(Member member);

	int delete(String id);

	Member get(String id);

	List<Member> getList();

	List<Member> getList(int page);

	List<Member> getList(String field, String query);

	List<Member> getList(String field, String query, int page);

}
