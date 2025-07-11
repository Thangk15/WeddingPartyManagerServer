package com.thangn260302.qltc.controller;

import com.thangn260302.qltc.DTO.NhanVienDTO;
import com.thangn260302.qltc.service.NhanVienService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nhanvien")
@CrossOrigin(origins = "*")
public class NhanVienController {

    private final NhanVienService nhanVienService;

    public NhanVienController(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

    @GetMapping("/duoc-phan-cong")
    public List<NhanVienDTO> getNhanVienDaPhanCong() {
        return nhanVienService.getNhanVienDaPhanCong();
    }
    
    @GetMapping("/chua-phan-cong")
    public List<NhanVienDTO> getNhanVienChuaPhanCong() {
        return nhanVienService.getNhanVienChuaPhanCong();
    }
}

