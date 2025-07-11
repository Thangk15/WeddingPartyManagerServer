package com.thangn260302.qltc.DTO;

import java.math.BigDecimal;

public class ChiTietMonAnDTO {
	private Long maMonAn;
    private String tenMonAn;
    private String tenLoaiMonAn;
    private Integer soLuong;
    private BigDecimal donGiaMonAn;

    public ChiTietMonAnDTO(Long maMonAn, String tenMonAn, String tenLoaiMonAn, Integer soLuong, BigDecimal donGiaMonAn) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.tenLoaiMonAn = tenLoaiMonAn;
        this.soLuong = soLuong;
        this.donGiaMonAn = donGiaMonAn;
    }

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

	public String getTenLoaiMonAn() {
		return tenLoaiMonAn;
	}

	public void setTenLoaiMonAn(String tenLoaiMonAn) {
		this.tenLoaiMonAn = tenLoaiMonAn;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getDonGiaMonAn() {
		return donGiaMonAn;
	}

	public void setDonGiaMonAn(BigDecimal donGiaMonAn) {
		this.donGiaMonAn = donGiaMonAn;
	}

	

}
