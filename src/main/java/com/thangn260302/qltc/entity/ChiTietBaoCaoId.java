package com.thangn260302.qltc.entity;


import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

@Embeddable
public class ChiTietBaoCaoId implements Serializable {

    @Column(name = "maBaoCao")
    private Long maBaoCao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @Column(name = "ngay")
    private LocalDate ngay;

    // Getters and Setters

    public Long getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(Long maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    // equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChiTietBaoCaoId)) return false;
        ChiTietBaoCaoId that = (ChiTietBaoCaoId) o;
        return Objects.equals(maBaoCao, that.maBaoCao) &&
               Objects.equals(ngay, that.ngay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBaoCao, ngay);
    }
}
