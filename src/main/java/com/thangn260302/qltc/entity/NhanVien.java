package com.thangn260302.qltc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

    @Id
    @Column(name = "maNhanVien")
    private Long maNhanVien;

    @Column(name = "tenNhanVien", length = 40)
    private String tenNhanVien;

    @Column(name = "gioiTinh", length = 15)
    private String gioiTinh;

    @Column(name = "sdt", length = 11)
    private String sdt;

    @Column(name = "loaiNhanVien", length = 20)
    private String loaiNhanVien;

    @ManyToOne
    @JoinColumn(name = "maCongViec", nullable = false)
    private CongViec congViec;

    // Getters and Setters

    public Long getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Long maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public CongViec getCongViec() {
        return congViec;
    }

    public void setCongViec(CongViec congViec) {
        this.congViec = congViec;
    }
}
