package com.thangn260302.qltc.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monan")
public class MonAn {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maMonAn")
    private Long maMonAn;
	
	@Column(name = "tenMonAn", length = 50)
	private String tenMonAn;
	
	@Column(name = "donGia", precision = 15, scale = 0)
	private BigDecimal donGia;
	
	@Column(name = "tenLoaiMonAn", length = 30)
	private String tenLoaiMonAn;

	public Long getMaMonAn() {
		return maMonAn;
	}

	public void setMaMonAn(Long maMonAn) {
		this.maMonAn = maMonAn;
	}

	public String getTenMonAn() {
		return tenMonAn;
	}

	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}

	public BigDecimal getDonGia() {
		return donGia;
	}

	public void setDonGia(BigDecimal donGia) {
		this.donGia = donGia;
	}

	public String getTenLoaiMonAn() {
		return tenLoaiMonAn;
	}

	public void setTenLoaiMonAn(String tenLoaiMonAn) {
		this.tenLoaiMonAn = tenLoaiMonAn;
	}

	
	
	
}
