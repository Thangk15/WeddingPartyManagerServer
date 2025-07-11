package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "chitiet_DV_thanhtoan")
public class ChiTietDVThanhToan {

    @EmbeddedId
    private ChiTietDVThanhToanId id;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "donGiaDichVu", precision = 15, scale = 2)
    private BigDecimal donGiaDichVu;

    @Column(name = "thanhTien", precision = 15, scale = 2)
    private BigDecimal thanhTien;

    @Lob
    @Column(name = "ghiChu")
    private String ghiChu;

    public ChiTietDVThanhToanId getId() {
        return id;
    }

    public void setId(ChiTietDVThanhToanId id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGiaDichVu() {
        return donGiaDichVu;
    }

    public void setDonGiaDichVu(BigDecimal donGiaDichVu) {
        this.donGiaDichVu = donGiaDichVu;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
