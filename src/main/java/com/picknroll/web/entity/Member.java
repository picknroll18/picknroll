package com.picknroll.web.entity;

import java.util.Date;

public class Member {
	private String id;
	private String password;
	private String nickname;
	private String email;
	private String birthday;
	private String gender;
	private String photo;
	private boolean restrictionStatus;
	private Date regDate;
	private Date editDate;

	public Member() {
	}

	public Member(String id, String password, String nickname, String email, String birthday, String gender,
			String photo, boolean restrictionStatus, Date regDate, Date editDate) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.photo = photo;
		this.restrictionStatus = restrictionStatus;
		this.regDate = regDate;
		this.editDate = editDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean isRestrictionStatus() {
		return restrictionStatus;
	}

	public void setRestrictionStatus(boolean restrictionStatus) {
		this.restrictionStatus = restrictionStatus;
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
		return "Member [id=" + id + ", password=" + password + ", nickname=" + nickname + ", email=" + email
				+ ", birthday=" + birthday + ", gender=" + gender + ", photo=" + photo + ", restrictionStatus="
				+ restrictionStatus + ", regDate=" + regDate + ", editDate=" + editDate + "]";
	}

}
