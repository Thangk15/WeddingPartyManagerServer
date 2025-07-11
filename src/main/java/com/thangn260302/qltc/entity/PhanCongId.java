package com.thangn260302.qltc.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PhanCongId implements Serializable {

    @Column(name = "maNhanVien")
    private Long maNhanVien;

    @Column(name = "maTiecCuoi")
    private Long maTiecCuoi;
    
    

    public PhanCongId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhanCongId(Long maNhanVien, Long maTiecCuoi) {
		super();
		this.maNhanVien = maNhanVien;
		this.maTiecCuoi = maTiecCuoi;
	}

	// Getters & Setters
    public Long getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Long maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Long getMaTiecCuoi() {
        return maTiecCuoi;
    }

    public void setMaTiecCuoi(Long maTiecCuoi) {
        this.maTiecCuoi = maTiecCuoi;
    }

    // equals & hashCode (bắt buộc cho khóa kép)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhanCongId)) return false;
        PhanCongId that = (PhanCongId) o;
        return Objects.equals(maNhanVien, that.maNhanVien) &&
               Objects.equals(maTiecCuoi, that.maTiecCuoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maNhanVien, maTiecCuoi);
    }
}
