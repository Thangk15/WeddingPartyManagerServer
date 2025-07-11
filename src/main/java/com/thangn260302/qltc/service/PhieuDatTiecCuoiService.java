package com.thangn260302.qltc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangn260302.qltc.DTO.PhieuDatTiecCuoiDTO;
import com.thangn260302.qltc.DTO.SoLuongTiecTheoThangDTO;
import com.thangn260302.qltc.DTO.ThongTinTiecCuoiTimKiemDTO;
import com.thangn260302.qltc.DTO.TiecCuoiThongTinDonGianDTO;
import com.thangn260302.qltc.entity.PhieuDatTiecCuoi;
import com.thangn260302.qltc.repository.PhieuDatTiecCuoiRepository;

@Service
public class PhieuDatTiecCuoiService {

    private final PhieuDatTiecCuoiRepository repo;

    @Autowired
    public PhieuDatTiecCuoiService(PhieuDatTiecCuoiRepository repo) {
        this.repo = repo;
    }
    
    public List<PhieuDatTiecCuoi> getAllPhieuDatTiecCuoi() {
        return repo.findAll();
    }
    
    public List<ThongTinTiecCuoiTimKiemDTO> getAllTiecCuoiTimKiem() {
        return repo.getAllTiecCuoiTimKiem();
    }


    public List<PhieuDatTiecCuoiDTO> getDTOByYear(int year) {
        return repo.findByNgayDaiTiecYear(year).stream()
            .map(PhieuDatTiecCuoiDTO::new)
            .toList();
    }
    
    public List<SoLuongTiecTheoThangDTO> thongKeTiecTheoThang(int year) {
        return repo.demSoLuongTiecTheoThang(year);
    }
    
    public List<TiecCuoiThongTinDonGianDTO> getThongTinDonGianTrongKhoang(LocalDate fromDate, LocalDate toDate) {
        return repo.findThongTinDonGianTrongKhoang(fromDate, toDate);
    }
}