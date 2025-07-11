package com.thangn260302.qltc.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "taikhoan")
public class TaiKhoan {
	@Id
	@Column(name = "userName")
	private String userName;
	
	@Column(nullable = false)
	private String passWord;
	
	private String role = "USER";
	
	@OneToMany(mappedBy = "taiKhoan")
	@JsonIgnore
	private List<PhieuDatTiecCuoi> phieuDatTiecCuoiList;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
