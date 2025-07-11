package com.thangn260302.qltc.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ThongTinTiecCuoiTimKiemDTO {
	private Long maTiecCuoi;
    private Long maSanh;
    private LocalDate ngayDat;
    private LocalDate ngayDaiTiec;
    private String tenCa;
    private Integer soLuongBan;
    private Integer soLuongBanDuTru;
    private BigDecimal donGiaBan;
    private BigDecimal tongTienBan;
    private BigDecimal tongTienDichVu;
    private BigDecimal tongTienDatTiec;
    private BigDecimal tienDatCoc;
    private BigDecimal conLai;
    private String tenCoDau;
    private String tenChuRe;
    private String sdt;
    private LocalTime gioBatDau;
    private Boolean tinhTrangPhanCong;
    private String tenSanh;
    private String userName;

    public ThongTinTiecCuoiTimKiemDTO(Long maTiecCuoi, Long maSanh, LocalDate ngayDat, LocalDate ngayDaiTiec, String tenCa, Integer soLuongBan,
                      Integer soLuongBanDuTru, BigDecimal donGiaBan, BigDecimal tongTienBan,
                      BigDecimal tongTienDichVu, BigDecimal tongTienDatTiec, BigDecimal tienDatCoc,
                      BigDecimal conLai, String tenCoDau, String tenChuRe, String sdt,
                      LocalTime gioBatDau, Boolean tinhTrangPhanCong, String tenSanh, String userName) {
        this.maTiecCuoi = maTiecCuoi;
        this.maSanh = maSanh;
        this.ngayDat = ngayDat;
        this.ngayDaiTiec = ngayDaiTiec;
        this.tenCa = tenCa;
        this.soLuongBan = soLuongBan;
        this.soLuongBanDuTru = soLuongBanDuTru;
        this.donGiaBan = donGiaBan;
        this.tongTienBan = tongTienBan;
        this.tongTienDichVu = tongTienDichVu;
        this.tongTienDatTiec = tongTienDatTiec;
        this.tienDatCoc = tienDatCoc;
        this.conLai = conLai;
        this.tenCoDau = tenCoDau;
        this.tenChuRe = tenChuRe;
        this.sdt = sdt;
        this.gioBatDau = gioBatDau;
        this.tinhTrangPhanCong = tinhTrangPhanCong;
        this.tenSanh = tenSanh;
        this.userName = userName;
    }

	public Long getMaTiecCuoi() {
		return maTiecCuoi;
	}

	public void setMaTiecCuoi(Long maTiecCuoi) {
		this.maTiecCuoi = maTiecCuoi;
	}

	public Long getMaSanh() {
		return maSanh;
	}

	public void setMaSanh(Long maSanh) {
		this.maSanh = maSanh;
	}

	public LocalDate getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(LocalDate ngayDat) {
		this.ngayDat = ngayDat;
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

	public Integer getSoLuongBan() {
		return soLuongBan;
	}

	public void setSoLuongBan(Integer soLuongBan) {
		this.soLuongBan = soLuongBan;
	}

	public Integer getSoLuongBanDuTru() {
		return soLuongBanDuTru;
	}

	public void setSoLuongBanDuTru(Integer soLuongBanDuTru) {
		this.soLuongBanDuTru = soLuongBanDuTru;
	}

	public BigDecimal getDonGiaBan() {
		return donGiaBan;
	}

	public void setDonGiaBan(BigDecimal donGiaBan) {
		this.donGiaBan = donGiaBan;
	}

	public BigDecimal getTongTienBan() {
		return tongTienBan;
	}

	public void setTongTienBan(BigDecimal tongTienBan) {
		this.tongTienBan = tongTienBan;
	}

	public BigDecimal getTongTienDichVu() {
		return tongTienDichVu;
	}

	public void setTongTienDichVu(BigDecimal tongTienDichVu) {
		this.tongTienDichVu = tongTienDichVu;
	}

	public BigDecimal getTongTienDatTiec() {
		return tongTienDatTiec;
	}

	public void setTongTienDatTiec(BigDecimal tongTienDatTiec) {
		this.tongTienDatTiec = tongTienDatTiec;
	}

	public BigDecimal getTienDatCoc() {
		return tienDatCoc;
	}

	public void setTienDatCoc(BigDecimal tienDatCoc) {
		this.tienDatCoc = tienDatCoc;
	}

	public BigDecimal getConLai() {
		return conLai;
	}

	public void setConLai(BigDecimal conLai) {
		this.conLai = conLai;
	}

	public String getTenCoDau() {
		return tenCoDau;
	}

	public void setTenCoDau(String tenCoDau) {
		this.tenCoDau = tenCoDau;
	}

	public String getTenChuRe() {
		return tenChuRe;
	}

	public void setTenChuRe(String tenChuRe) {
		this.tenChuRe = tenChuRe;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public LocalTime getGioBatDau() {
		return gioBatDau;
	}

	public void setGioBatDau(LocalTime gioBatDau) {
		this.gioBatDau = gioBatDau;
	}

	public Boolean getTinhTrangPhanCong() {
		return tinhTrangPhanCong;
	}

	public void setTinhTrangPhanCong(Boolean tinhTrangPhanCong) {
		this.tinhTrangPhanCong = tinhTrangPhanCong;
	}

	public String getTenSanh() {
		return tenSanh;
	}

	public void setTenSanh(String tenSanh) {
		this.tenSanh = tenSanh;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
