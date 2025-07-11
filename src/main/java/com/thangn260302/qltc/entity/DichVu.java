package com.thangn260302.qltc.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "dichvu")
public class DichVu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maDichVu")
	private Long maDichVu;
	
	@Column(name = "tenDichVu", length = 50)
	private String tenDichVu;
	
	@Column(name = "donGia", precision = 15, scale = 0)
	private BigDecimal donGia;

	@ManyToOne(optional = true)
	@JoinColumn(name = "maCongViec", referencedColumnName = "maCongViec", nullable = true)
    private CongViec congViec;

	public Long getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(Long maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public BigDecimal getDonGia() {
		return donGia;
	}

	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}

	public CongViec getCongViec() {
		return congViec;
	}

	public void setCongViec(CongViec congViec) {
		this.congViec = congViec;
	}

	
}
