package com.thangn260302.qltc.DTO;

import java.time.LocalDate;

public class TiecCuoiThongTinDonGianDTO {
    private Long maTiecCuoi;
    private LocalDate ngayDaiTiec;
    private String tenCa;
    private Long maSanh;
    private Integer soLuongBan;
    private Boolean tinhTrangPhanCong;

    public TiecCuoiThongTinDonGianDTO(Long maTiecCuoi, LocalDate ngayDaiTiec, String tenCa, Long maSanh, Integer soLuongBan, Boolean tinhTrangPhanCong) {
        this.maTiecCuoi = maTiecCuoi;
        this.ngayDaiTiec = ngayDaiTiec;
        this.tenCa = tenCa;
        this.maSanh = maSanh;
        this.soLuongBan = soLuongBan;
        this.tinhTrangPhanCong = tinhTrangPhanCong;
    }

	public Long getMaTiecCuoi() {
		return maTiecCuoi;
	}

	public void setMaTiecCuoi(Long maTiecCuoi) {
		this.maTiecCuoi = maTiecCuoi;
	}

	public LocalDate getNgayDaiTiec() {
		return ngayDaiTiec;
	}

	public void setNgayDaiTiec(LocalDate ngayDaiTiec) {
		this.ngayDaiTiec = ngayDaiTiec;
	}

	public String getTenCa() {
		return tenCa;
	}

	public void setTenCa(String tenCa) {
		this.tenCa = tenCa;
	}

	public Long getMaSanh() {
		return maSanh;
	}

	public void setMaSanh(Long maSanh) {
		this.maSanh = maSanh;
	}

	public Integer getSoLuongBan() {
		return soLuongBan;
	}

	public void setSoLuongBan(Integer soLuongBan) {
		this.soLuongBan = soLuongBan;
	}

	public Boolean getTinhTrangPhanCong() {
		return tinhTrangPhanCong;
	}

	public void setTinhTrangPhanCong(Boolean tinhTrangPhanCong) {
		this.tinhTrangPhanCong = tinhTrangPhanCong;
	}

    // Getters & setters nếu cần
    
}