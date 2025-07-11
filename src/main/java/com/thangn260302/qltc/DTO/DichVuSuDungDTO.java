package com.thangn260302.qltc.DTO;

import java.math.BigDecimal;

public class DichVuSuDungDTO {
	private Long maDichVu;
    private String tenDichVu;
    private BigDecimal gia;
    private int soLuong;
    private Long maCongViec;
    private String tenCongViec;

    public DichVuSuDungDTO(Long maDichVu, String tenDichVu, BigDecimal gia, int soLuong, Long maCongViec, String tenCongViec) {
        this.maDichVu = maDichVu;
        this.tenDichVu = tenDichVu;
        this.gia = gia;
        this.soLuong = soLuong;
        this.maCongViec = maCongViec;
        this.tenCongViec = tenCongViec;
    }

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

	public BigDecimal getGia() {
		return gia;
	}

	public void setGia(BigDecimal gia) {
		this.gia = gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public Long getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(Long maCongViec) {
		this.maCongViec = maCongViec;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}
    
	
    
}
