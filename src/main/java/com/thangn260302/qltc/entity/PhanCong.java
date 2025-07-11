package com.thangn260302.qltc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phancong")
public class PhanCong {

    @EmbeddedId
    private PhanCongId id;

    @ManyToOne
    @JoinColumn(name = "maNhanVien", insertable = false, updatable = false)
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "maTiecCuoi", insertable = false, updatable = false)
    private PhieuDatTiecCuoi tiecCuoi;

    
    
    public PhanCong() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhanCong(PhanCongId id, NhanVien nhanVien, PhieuDatTiecCuoi tiecCuoi) {
		super();
		this.id = id;
		this.nhanVien = nhanVien;
		this.tiecCuoi = tiecCuoi;
	}

	// Getters & Setters

    public PhanCongId getId() {
        return id;
    }

    public void setId(PhanCongId id) {
        this.id = id;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public PhieuDatTiecCuoi getTiecCuoi() {
        return tiecCuoi;
    }

    public void setTiecCuoi(PhieuDatTiecCuoi tiecCuoi) {
        this.tiecCuoi = tiecCuoi;
    }
}
