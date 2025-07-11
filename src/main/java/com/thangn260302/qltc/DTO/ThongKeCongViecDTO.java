package com.thangn260302.qltc.DTO;

public class ThongKeCongViecDTO {
    private Long maCongViec;
    private String tenCongViec;
    private Long soLuongDichVu;

    public ThongKeCongViecDTO(Long maCongViec, String tenCongViec, Long soLuongDichVu) {
        this.maCongViec = maCongViec;
        this.tenCongViec = tenCongViec;
        this.soLuongDichVu = soLuongDichVu;
    }

    // Getters và Setters
    public Long getMaCongViec() {
        return maCongViec;
    }

    public void setMaCongViec(Long maCongViec) {
        this.maCongViec = maCongViec;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public Long getSoLuongDichVu() {
        return soLuongDichVu;
    }

    public void setSoLuongDichVu(Long soLuongDichVu) {
        this.soLuongDichVu = soLuongDichVu;
    }
}
