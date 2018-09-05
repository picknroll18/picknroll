package com.picknroll.web.entity;

public class MemberService {

	private String memberId;
	private String serviceId;
	
	public MemberService() {
		
	}
	
	public MemberService(String memberId, String serviceId) {
		this.memberId = memberId;
		this.serviceId = serviceId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Override
	public String toString() {
		return "MemberService [memberId=" + memberId + ", serviceId=" + serviceId + "]";
	}
	
}
