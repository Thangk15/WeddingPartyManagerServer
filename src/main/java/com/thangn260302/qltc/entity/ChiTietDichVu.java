package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "chitietdichvu")
public class ChiTietDichVu {

    @EmbeddedId
    private ChiTietDichVuId id;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "donGiaDichVu", precision = 15, scale = 0)
    private BigDecimal donGiaDichVu;

    @Column(name = "thanhTien", precision = 15, scale = 0)
    private BigDecimal thanhTien;
    
    @ManyToOne
    @JoinColumn(name = "maTiecCuoi", insertable = false, updatable = false)
    private PhieuDatTiecCuoi tiecCuoi;
    
    @ManyToOne
    @JoinColumn(name = "maDichVu", insertable = false, updatable = false)
    private DichVu dichVu;

    // Getters and Setters
    public ChiTietDichVuId getId() {
        return id;
    }

    public void setId(ChiTietDichVuId id) {
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
}
