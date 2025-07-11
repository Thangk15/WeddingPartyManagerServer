package com.thangn260302.qltc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangn260302.qltc.DTO.DichVuSuDungDTO;
import com.thangn260302.qltc.entity.ChiTietDichVu;
import com.thangn260302.qltc.service.ChiTietDichVuService;

@RestController
@RequestMapping("/api/chitietdichvu")
public class ChiTietDichVuController {

    private final ChiTietDichVuService service;

    @Autowired
    public ChiTietDichVuController(ChiTietDichVuService service) {
        this.service = service;
    }
    
    @GetMapping("/tieccuoi/thongtindaydu/{maTiecCuoi}")
    public ResponseEntity<List<ChiTietDichVu>> getChiTiet(@PathVariable Long maTiecCuoi) {
        List<ChiTietDichVu> list = service.getChiTietByTiecCuoi(maTiecCuoi);
        if (list.isEmpty()) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(list);
    }
    
    @GetMapping("/tieccuoi/{maTiecCuoi}")
    public ResponseEntity<List<DichVuSuDungDTO>> getDichVuTheoTiecCuoi(@PathVariable Long maTiecCuoi) {
        List<DichVuSuDungDTO> list = service.getDichVuByTiecCuoi(maTiecCuoi);
        if (list.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(list);
    }
    
    @GetMapping("/thongke/congviec/{maTiecCuoi}")
    public ResponseEntity<?> thongKe(@PathVariable Long maTiecCuoi) {
        return ResponseEntity.ok(service.thongKeTheoTiecCuoi(maTiecCuoi));
    }
}

