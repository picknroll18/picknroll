package com.picknroll.web.dao;

import java.util.List;

import com.picknroll.web.entity.MemberRole;

public interface MemberRoleDao {

	int insert(MemberRole memberRole);

	int update(MemberRole memberRole);

	int delete(MemberRole memberRole);

	MemberRole get(MemberRole memberRole);

	List<MemberRole> getList();

	List<MemberRole> getList(String memberId);

}
