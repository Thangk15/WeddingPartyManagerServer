package com.thangn260302.qltc.entity;

import java.time.LocalTime;
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
@Table(name = "ca")
public class Ca {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maCa")
    private Long id;
	
	@Column(name = "tenCa", length = 20)
	private String tenCa;
	
	@Column(name = "gioBatDau")
	private LocalTime gioBatDau;
	
	@Column(name = "gioKetThuc")
	private LocalTime gioKetThuc;
	
	@OneToMany(mappedBy = "ca")
	@JsonIgnore
	private List<PhieuDatTiecCuoi> phieuDatTiecCuoiList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenCa() {
		return tenCa;
	}

	public void setTenCa(String tenCa) {
		this.tenCa = tenCa;
	}

	public LocalTime getGioBatDau() {
		return gioBatDau;
	}

	public void setGioBatDau(LocalTime gioBatDau) {
		this.gioBatDau = gioBatDau;
	}

	public LocalTime getGioKetThuc() {
		return gioKetThuc;
	}

	public void setGioKetThuc(LocalTime gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}
	
}
