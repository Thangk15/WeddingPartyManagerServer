package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ThamSo")
public class ThamSo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // hoặc tự thêm cột id nếu cần
    private Long id;

    @Column(name = "KiemTraPhat")
    private boolean kiemTraPhat;

    @Column(name = "TiLePhat", precision = 15, scale = 2)
    private BigDecimal tiLePhat;

    @Column(name = "TiLeDatCoc", precision = 15, scale = 2)
    private BigDecimal tiLeDatCoc;

    @Column(name = "TGPhatHuyTiec")
    private int tgPhatHuyTiec;

    @Column(name = "thoiGianDatTiec")
    private int thoiGianDatTiec;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isKiemTraPhat() {
        return kiemTraPhat;
    }

    public void setKiemTraPhat(boolean kiemTraPhat) {
        this.kiemTraPhat = kiemTraPhat;
    }

    public BigDecimal getTiLePhat() {
        return tiLePhat;
    }

    public void setTiLePhat(BigDecimal tiLePhat) {
        this.tiLePhat = tiLePhat;
    }

    public BigDecimal getTiLeDatCoc() {
        return tiLeDatCoc;
    }

    public void setTiLeDatCoc(BigDecimal tiLeDatCoc) {
        this.tiLeDatCoc = tiLeDatCoc;
    }

    public int getTgPhatHuyTiec() {
        return tgPhatHuyTiec;
    }

    public void setTgPhatHuyTiec(int tgPhatHuyTiec) {
        this.tgPhatHuyTiec = tgPhatHuyTiec;
    }

    public int getThoiGianDatTiec() {
        return thoiGianDatTiec;
    }

    public void setThoiGianDatTiec(int thoiGianDatTiec) {
        this.thoiGianDatTiec = thoiGianDatTiec;
    }
}
