package com.thangn260302.qltc.DTO;

public class SoLuongTiecTheoThangDTO {
    private int thang;
    private long soLuong;

    public SoLuongTiecTheoThangDTO(int thang, long soLuong) {
        this.thang = thang;
        this.soLuong = soLuong;
    }

    public int getThang() {
        return thang;
    }

    public long getSoLuong() {
        return soLuong;
    }

	public void setThang(int thang) {
		this.thang = thang;
	}

	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
    
    
}
