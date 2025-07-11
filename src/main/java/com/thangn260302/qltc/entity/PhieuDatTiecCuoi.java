package com.thangn260302.qltc.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "phieudattieccuoi")
public class PhieuDatTiecCuoi {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "maTiecCuoi")
    private Long maTiecCuoi;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	@Column(name = "ngayDat")
    private LocalDate ngayDat;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "ngayDaiTiec")
    private LocalDate ngayDaiTiec;

    @Column(name = "soLuongBan")
    private Integer soLuongBan;

    @Column(name = "soLuongBanDuTru")
    private Integer soLuongBanDuTru;

    @Column(name = "donGiaBan", precision = 15, scale = 0)
    private BigDecimal donGiaBan;

    @Column(name = "tongTienBan", precision = 15, scale = 0)
    private BigDecimal tongTienBan;

    @Column(name = "tongTienDichVu", precision = 15, scale = 0)
    private BigDecimal tongTienDichVu;

    @Column(name = "tongTienDatTiec", precision = 15, scale = 0)
    private BigDecimal tongTienDatTiec;

    @Column(name = "tienDatCoc", precision = 15, scale = 0)
    private BigDecimal tienDatCoc;

    @Column(name = "conLai", precision = 15, scale = 0)
    private BigDecimal conLai;

    @Column(name = "tenCoDau", length = 30)
    private String tenCoDau;

    @Column(name = "tenChuRe", length = 30)
    private String tenChuRe;

    @Column(name = "sdt", length = 10)
    private String sdt;

    @ManyToOne
    @JoinColumn(name = "maCa", referencedColumnName = "maCa", nullable = false)
    @JsonIgnoreProperties("phieuDatTiecCuoiList") 
    private Ca ca;

    @ManyToOne
    @JoinColumn(name = "maSanh", referencedColumnName = "maSanh", nullable = false)
    @JsonIgnoreProperties("phieuDatTiecCuoiList")
    private Sanh sanh;

    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "username", nullable = false)
    @JsonIgnoreProperties("phieuDatTiecCuoiList")
    private TaiKhoan taiKhoan;

    @Column(name = "tinhtrangphancong")
    private Boolean tinhTrangPhanCong;

	public Long getMaTiecCuoi() {
		return maTiecCuoi;
	}

	public void setMaTiecCuoi(Long maTiecCuoi) {
		this.maTiecCuoi = maTiecCuoi;
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

	public Ca getCa() {
		return ca;
	}

	public void setCa(Ca ca) {
		this.ca = ca;
	}

	public Sanh getSanh() {
		return sanh;
	}

	public void setSanh(Sanh sanh) {
		this.sanh = sanh;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public Boolean getTinhTrangPhanCong() {
		return tinhTrangPhanCong;
	}

	public void setTinhTrangPhanCong(Boolean tinhTrangPhanCong) {
		this.tinhTrangPhanCong = tinhTrangPhanCong;
	}

	
    
    
}
