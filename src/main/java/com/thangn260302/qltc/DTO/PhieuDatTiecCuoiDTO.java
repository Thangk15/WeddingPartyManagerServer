package com.thangn260302.qltc.DTO;

import java.math.BigDecimal;

import com.thangn260302.qltc.entity.PhieuDatTiecCuoi;

public class PhieuDatTiecCuoiDTO {
    private Long maTiecCuoi;
    private String ngayDat;
    private String ngayDaiTiec;
    private String tenChuRe;
    private String tenCoDau;
    private String sdt;
    private int soLuongBan;
    private BigDecimal tongTienBan;
    private String tenCa;
    private String tenSanh;
    private String taiKhoan;

    public PhieuDatTiecCuoiDTO(PhieuDatTiecCuoi p) {
        this.maTiecCuoi = p.getMaTiecCuoi();
        this.ngayDat = p.getNgayDat().toString();
        this.ngayDaiTiec = p.getNgayDaiTiec().toString();
        this.tenChuRe = p.getTenChuRe();
        this.tenCoDau = p.getTenCoDau();
        this.sdt = p.getSdt();
        this.soLuongBan = p.getSoLuongBan();
        this.tongTienBan = p.getTongTienBan();
        this.tenCa = p.getCa().getTenCa();
        this.tenSanh = p.getSanh().getTenSanh();
        this.taiKhoan = p.getTaiKhoan().getUserName();
    }

	public Long getMaTiecCuoi() {
		return maTiecCuoi;
	}

	public void setMaTiecCuoi(Long maTiecCuoi) {
		this.maTiecCuoi = maTiecCuoi;
	}

	public String getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(String ngayDat) {
		this.ngayDat = ngayDat;
	}

	public String getNgayDaiTiec() {
		return ngayDaiTiec;
	}

	public void setNgayDaiTiec(String ngayDaiTiec) {
		this.ngayDaiTiec = ngayDaiTiec;
	}

	public String getTenChuRe() {
		return tenChuRe;
	}

	public void setTenChuRe(String tenChuRe) {
		this.tenChuRe = tenChuRe;
	}

	public String getTenCoDau() {
		return tenCoDau;
	}

	public void setTenCoDau(String tenCoDau) {
		this.tenCoDau = tenCoDau;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSoLuongBan() {
		return soLuongBan;
	}

	public void setSoLuongBan(int soLuongBan) {
		this.soLuongBan = soLuongBan;
	}

	public BigDecimal getTongTienBan() {
		return tongTienBan;
	}

	public void setTongTienBan(BigDecimal tongTienBan) {
		this.tongTienBan = tongTienBan;
	}

	public String getTenCa() {
		return tenCa;
	}

	public void setTenCa(String tenCa) {
		this.tenCa = tenCa;
	}

	public String getTenSanh() {
		return tenSanh;
	}

	public void setTenSanh(String tenSanh) {
		this.tenSanh = tenSanh;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	
    
}
