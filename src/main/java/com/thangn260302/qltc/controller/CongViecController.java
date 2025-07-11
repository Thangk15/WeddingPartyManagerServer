package com.thangn260302.qltc.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thangn260302.qltc.entity.CongViec;
import com.thangn260302.qltc.service.CongViecService;

@RestController
@RequestMapping("/api/congviec")
@CrossOrigin(origins = "*")
public class CongViecController {

    @Autowired
    private CongViecService congViecService;

    @GetMapping
    public List<CongViec> getAllCongViec() {
        return congViecService.getAllCongViec();
    }
    
    @GetMapping("/{id}")
    public Optional<CongViec> getById(@PathVariable Long id) {
        return congViecService.getById(id);
    }

    @PostMapping
    public CongViec insert(@RequestBody CongViec congViec) {
        try {
        	return congViecService.insert(congViec);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi thêm món ăn: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public CongViec update(@PathVariable Long id, @RequestBody CongViec congViec) {
        try {
            return congViecService.updateCongViec(id, congViec);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi cập nhật món ăn: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            congViecService.delete(id);
            return ResponseEntity.ok(Map.of("message", "Đã xoá sảnh thành công"));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy sảnh!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi xoá sảnh.");
        }
    }
}
