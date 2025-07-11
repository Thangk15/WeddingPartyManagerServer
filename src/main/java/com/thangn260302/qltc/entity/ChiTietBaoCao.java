package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "chitietbaocao")
public class ChiTietBaoCao {

    @EmbeddedId
    private ChiTietBaoCaoId id;

    @Column(name = "soLuongTiec")
    private int soLuongTiec;

    @Column(name = "doanhThu", precision = 15, scale = 2)
    private BigDecimal doanhThu;

    @Column(name = "tiLe")
    private float tiLe;

    // Getters and Setters

    public ChiTietBaoCaoId getId() {
        return id;
    }

    public void setId(ChiTietBaoCaoId id) {
        this.id = id;
    }

    public int getSoLuongTiec() {
        return soLuongTiec;
    }

    public void setSoLuongTiec(int soLuongTiec) {
        this.soLuongTiec = soLuongTiec;
    }

    public BigDecimal getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(BigDecimal doanhThu) {
        this.doanhThu = doanhThu;
    }

    public float getTiLe() {
        return tiLe;
    }

    public void setTiLe(float tiLe) {
        this.tiLe = tiLe;
    }
}
