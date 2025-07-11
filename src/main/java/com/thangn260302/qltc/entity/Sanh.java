package com.thangn260302.qltc.entity;

import java.math.BigDecimal;
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
@Table(name = "sanh")
public class Sanh {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maSanh")
    private Long maSanh;
	
	@Column(name = "tenSanh", length = 50)
    private String tenSanh;
	
	@Column(name = "soLuongBanToiDa")
    private Integer soLuongBanToiDa;
    
    @Column(name = "donGiaBanToiThieu",precision = 15, scale = 0)
    private BigDecimal donGiaBanToiThieu;
    
    @OneToMany(mappedBy = "sanh")
    @JsonIgnore
    private List<PhieuDatTiecCuoi> phieuDatTiecCuoiList;

	public Long getMaSanh() {
		return maSanh;
	}

	public void setMaSanh(Long maSanh) {
		this.maSanh = maSanh;
	}

	public String getTenSanh() {
		return tenSanh;
	}

	public void setTenSanh(String tenSanh) {
		this.tenSanh = tenSanh;
	}

	public Integer getSoLuongBanToiDa() {
		return soLuongBanToiDa;
	}

	public void setSoLuongBanToiDa(Integer soLuongBanToiDa) {
		this.soLuongBanToiDa = soLuongBanToiDa;
	}

	public BigDecimal getDonGiaBanToiThieu() {
		return donGiaBanToiThieu;
	}

	public void setDonGiaBanToiThieu(BigDecimal donGiaBanToiThieu) {
		this.donGiaBanToiThieu = donGiaBanToiThieu;
	}

	public List<PhieuDatTiecCuoi> getPhieuDatTiecCuoiList() {
		return phieuDatTiecCuoiList;
	}

	public void setPhieuDatTiecCuoiList(List<PhieuDatTiecCuoi> phieuDatTiecCuoiList) {
		this.phieuDatTiecCuoiList = phieuDatTiecCuoiList;
	}

	
    
    
}
