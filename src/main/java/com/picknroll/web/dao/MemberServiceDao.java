package com.picknroll.web.dao;

import java.util.List;

import com.picknroll.web.entity.MemberService;

public interface MemberServiceDao {
	
	int insert(MemberService memberService);

	int update(MemberService memberService);

	int delete(String id);

	MemberService get(String id);

	List<MemberService> getList();
	
}
