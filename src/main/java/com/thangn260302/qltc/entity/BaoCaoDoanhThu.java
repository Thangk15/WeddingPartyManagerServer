package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "baocaodoanhthu")
public class BaoCaoDoanhThu {

    @Id
    @Column(name = "maBaoCao")
    private Long maBaoCao;
    
    @Column(name = "nam")
    private int nam;

    @Column(name = "thang")
    private int thang;

    @Column(name = "tongDoanhThu", precision = 15, scale = 2)
    private BigDecimal tongDoanhThu;

    // Getters and Setters

    public Long getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(Long maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public BigDecimal getTongDoanhThu() {
        return tongDoanhThu;
    }

    public void setTongDoanhThu(BigDecimal tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }
}
