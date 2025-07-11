package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChiTietDVThanhToanId implements Serializable {

    @Column(name = "maHoaDon")
    private Long maHoaDon;

    @Column(name = "maDichVu")
    private Long maDichVu;

    public Long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Long getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(Long maDichVu) {
        this.maDichVu = maDichVu;
    }

    // equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChiTietDVThanhToanId)) return false;
        ChiTietDVThanhToanId that = (ChiTietDVThanhToanId) o;
        return Objects.equals(maHoaDon, that.maHoaDon) &&
               Objects.equals(maDichVu, that.maDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maHoaDon, maDichVu);
    }
}
