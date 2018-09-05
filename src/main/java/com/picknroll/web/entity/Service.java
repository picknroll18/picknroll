package com.picknroll.web.entity;

import java.util.Date;

public class Service {

	private String id;
	private String title;
	private String url;
	private String icon;
	private String status;
	private String isLogin;
	private String description;
	private String target;
	private String serviceCategoryId;
	private Date regDate;
	private Date editDate;

	public Service() {
	}

	public Service(String id, String title, String url, String icon, String status, String isLogin, String description,
			String target, String serviceCategoryId, Date regDate, Date editDate) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.icon = icon;
		this.status = status;
		this.isLogin = isLogin;
		this.description = description;
		this.target = target;
		this.serviceCategoryId = serviceCategoryId;
		this.regDate = regDate;
		this.editDate = editDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(String isLogin) {
		this.isLogin = isLogin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getServiceCategoryId() {
		return serviceCategoryId;
	}

	public void setServiceCategoryId(String serviceCategoryId) {
		this.serviceCategoryId = serviceCategoryId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", title=" + title + ", url=" + url + ", icon=" + icon + ", status=" + status
				+ ", isLogin=" + isLogin + ", description=" + description + ", target=" + target
				+ ", serviceCategoryId=" + serviceCategoryId + ", regDate=" + regDate + ", editDate=" + editDate + "]";
	}

}
