package com.thangn260302.qltc.DTO;

public class NhanVienDTO {
	private Long maNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private String loaiNhanVien;
    private String sdt;
    private Long maCongViec;
    private Long maTiecCuoi; // Giả sử kiểu là String, nếu kiểu khác thì bạn chỉnh lại

    public NhanVienDTO(Long maNhanVien, String tenNhanVien, String gioiTinh, 
		String loaiNhanVien, String sdt, Long maCongViec, Long maTiecCuoi) {
	        this.maNhanVien = maNhanVien;
	        this.tenNhanVien = tenNhanVien;
	        this.gioiTinh = gioiTinh;
	        this.loaiNhanVien = loaiNhanVien;
	        this.sdt = sdt;
	        this.maCongViec = maCongViec;
	        this.maTiecCuoi = maTiecCuoi;
    }

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

	public String getLoaiNhanVien() {
		return loaiNhanVien;
	}

	public void setLoaiNhanVien(String loaiNhanVien) {
		this.loaiNhanVien = loaiNhanVien;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Long getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(Long maCongViec) {
		this.maCongViec = maCongViec;
	}

	public Long getMaTiecCuoi() {
		return maTiecCuoi;
	}

	public void setMaTiecCuoi(Long maTiecCuoi) {
		this.maTiecCuoi = maTiecCuoi;
	}

}
