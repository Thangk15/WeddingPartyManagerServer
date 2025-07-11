package com.thangn260302.qltc.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "chitietmonan")
public class ChiTietMonAn {

    @EmbeddedId
    private ChiTietMonAnId id;

    @Column(name = "donGiaMonAn", precision = 15, scale = 2)
    private BigDecimal donGiaMonAn;

    @Column(name = "soLuong")
    private int soLuong;

    @ManyToOne
    @MapsId("maTiecCuoi")
    @JoinColumn(name = "maTiecCuoi", referencedColumnName = "maTiecCuoi")
    private PhieuDatTiecCuoi tiecCuoi;

    @ManyToOne
    @MapsId("maMonAn")
    @JoinColumn(name = "maMonAn", referencedColumnName = "maMonAn")
    private MonAn monAn;

    // Getters & Setters

    public ChiTietMonAnId getId() {
        return id;
    }

    public void setId(ChiTietMonAnId id) {
        this.id = id;
    }

    public BigDecimal getDonGiaMonAn() {
        return donGiaMonAn;
    }

    public void setDonGiaMonAn(BigDecimal donGiaMonAn) {
        this.donGiaMonAn = donGiaMonAn;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public PhieuDatTiecCuoi getTiecCuoi() {
        return tiecCuoi;
    }

    public void setTiecCuoi(PhieuDatTiecCuoi tiecCuoi) {
        this.tiecCuoi = tiecCuoi;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }
}
