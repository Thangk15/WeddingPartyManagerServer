package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "hoadon")
public class HoaDon {

    @Id
    @Column(name = "maHoaDon")
    private Long maHoaDon;

    @Column(name = "maTiecCuoi", nullable = false)
    private Long maTiecCuoi;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "ngayThanhToan", nullable = false)
    private LocalDate ngayThanhToan;

    @Column(name = "tongTienDichVu", precision = 15, scale = 0)
    private BigDecimal tongTienDichVu;

    @Column(name = "tienPhat", precision = 15, scale = 0)
    private BigDecimal tienPhat;

    @Column(name = "tongTienHoaDon", precision = 15, scale = 0)
    private BigDecimal tongTienHoaDon;

    @Column(name = "conLai", precision = 15, scale = 0)
    private BigDecimal conLai;

    @Column(name = "userName", length = 15, nullable = false)
    private String userName;

    // Getters and Setters

    public Long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Long getMaTiecCuoi() {
        return maTiecCuoi;
    }

    public void setMaTiecCuoi(Long maTiecCuoi) {
        this.maTiecCuoi = maTiecCuoi;
    }

    public LocalDate getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(LocalDate ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public BigDecimal getTongTienDichVu() {
        return tongTienDichVu;
    }

    public void setTongTienDichVu(BigDecimal tongTienDichVu) {
        this.tongTienDichVu = tongTienDichVu;
    }

    public BigDecimal getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(BigDecimal tienPhat) {
        this.tienPhat = tienPhat;
    }

    public BigDecimal getTongTienHoaDon() {
        return tongTienHoaDon;
    }

    public void setTongTienHoaDon(BigDecimal tongTienHoaDon) {
        this.tongTienHoaDon = tongTienHoaDon;
    }

    public BigDecimal getConLai() {
        return conLai;
    }

    public void setConLai(BigDecimal conLai) {
        this.conLai = conLai;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
