package com.thangn260302.qltc.controller;

import com.thangn260302.qltc.entity.PhanCong;
import com.thangn260302.qltc.service.PhanCongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phancong")
@CrossOrigin("*")
public class PhanCongController {

    @Autowired
    private PhanCongService phanCongService;

    @GetMapping
    public List<PhanCong> getAll() {
        return phanCongService.getAll();
    }

    @PostMapping
    public PhanCong create(@RequestParam Long maNhanVien, @RequestParam Long maTiecCuoi) {
        return phanCongService.create(maNhanVien, maTiecCuoi);
    }

    @DeleteMapping
    public void delete(@RequestParam Long maNhanVien, @RequestParam Long maTiecCuoi) {
        phanCongService.delete(maNhanVien, maTiecCuoi);
    }

    @GetMapping("/tiec")
    public List<PhanCong> getByTiecCuoi(@RequestParam Long maTiecCuoi) {
        return phanCongService.getByTiecCuoi(maTiecCuoi);
    }

    @GetMapping("/nhanvien")
    public List<PhanCong> getByNhanVien(@RequestParam Long maNhanVien) {
        return phanCongService.getByNhanVien(maNhanVien);
    }
}
