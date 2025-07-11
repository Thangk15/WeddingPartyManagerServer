package com.thangn260302.qltc.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "congviec")
public class CongViec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maCongViec")
	private Long maCongViec;
	
	@Column(name = "tenCongViec", length = 40)
	private String tenCongViec;

	@OneToMany(mappedBy = "congViec")
	@JsonIgnore // <- Chặn vòng lặp khi serialize
    private List<DichVu> dichVus;

	public Long getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(Long id) {
		this.maCongViec = id;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public List<DichVu> getDichVus() {
		return dichVus;
	}

	public void setDichVus(List<DichVu> dichVus) {
		this.dichVus = dichVus;
	}
	
}
