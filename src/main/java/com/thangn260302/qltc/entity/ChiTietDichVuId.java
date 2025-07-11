package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChiTietDichVuId implements Serializable {

    @Column(name = "maTiecCuoi")
    private Long maTiecCuoi;

    @Column(name = "maDichVu")
    private Long maDichVu;

    // Getters and Setters
    public Long getMaTiecCuoi() {
        return maTiecCuoi;
    }

    public void setMaTiecCuoi(Long maTiecCuoi) {
        this.maTiecCuoi = maTiecCuoi;
    }

    public Long getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(Long maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChiTietDichVuId)) return false;
        ChiTietDichVuId that = (ChiTietDichVuId) o;
        return Objects.equals(maTiecCuoi, that.maTiecCuoi) &&
               Objects.equals(maDichVu, that.maDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTiecCuoi, maDichVu);
    }
}
