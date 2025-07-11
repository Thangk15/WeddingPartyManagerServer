package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ChiTietMonAnId implements Serializable {

    @Column(name = "maMonAn")
    private Long maMonAn;

    @Column(name = "maTiecCuoi")
    private Long maTiecCuoi;

    // Getters, Setters, hashCode, equals

    public Long getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(Long maMonAn) {
        this.maMonAn = maMonAn;
    }

    public Long getMaTiecCuoi() {
        return maTiecCuoi;
    }

    public void setMaTiecCuoi(Long maTiecCuoi) {
        this.maTiecCuoi = maTiecCuoi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChiTietMonAnId)) return false;
        ChiTietMonAnId that = (ChiTietMonAnId) o;
        return Objects.equals(maMonAn, that.maMonAn) &&
               Objects.equals(maTiecCuoi, that.maTiecCuoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maMonAn, maTiecCuoi);
    }
}
