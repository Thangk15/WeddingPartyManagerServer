package com.thangn260302.qltc.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thangn260302.qltc.DTO.PhieuDatTiecCuoiDTO;
import com.thangn260302.qltc.DTO.SoLuongTiecTheoThangDTO;
import com.thangn260302.qltc.DTO.ThongTinTiecCuoiTimKiemDTO;
import com.thangn260302.qltc.DTO.TiecCuoiThongTinDonGianDTO;
import com.thangn260302.qltc.entity.PhieuDatTiecCuoi;
import com.thangn260302.qltc.service.PhieuDatTiecCuoiService;

@RestController
@RequestMapping("/api/phieudattieccuoi")
@CrossOrigin(origins = "http://localhost:4200")
public class PhieuDatTiecCuoiController {

	@Autowired
    private final PhieuDatTiecCuoiService service;

    public PhieuDatTiecCuoiController(PhieuDatTiecCuoiService service) {
        this.service = service;
    }
    
    @GetMapping("/all")
    public List<PhieuDatTiecCuoi> getAll() {
        return service.getAllPhieuDatTiecCuoi();
    }
    
    @GetMapping("/wedding-search")
    public List<ThongTinTiecCuoiTimKiemDTO> getWeddingList() {
        return service.getAllTiecCuoiTimKiem();
    }
    
    @GetMapping("/nam/{year}")
    public ResponseEntity<List<PhieuDatTiecCuoiDTO>> getByYear(@PathVariable int year) {
        return ResponseEntity.ok(service.getDTOByYear(year));
    }
    
    @GetMapping("/thongke/thang/{year}")
    public ResponseEntity<List<SoLuongTiecTheoThangDTO>> getThongKeTheoThang(@PathVariable int year) {
        return ResponseEntity.ok(service.thongKeTiecTheoThang(year));
    }
    
    @GetMapping("/dongian")
    public List<TiecCuoiThongTinDonGianDTO> getDanhSachTiecCuoiDonGian(
        @RequestParam("from") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate from,
        @RequestParam("to") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate to) {
        
        return service.getThongTinDonGianTrongKhoang(from, to);
    }
}
