package com.thangn260302.qltc.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangn260302.qltc.entity.MonAn;
import com.thangn260302.qltc.repository.MonAnRepository;
import com.thangn260302.qltc.service.MonAnService;

@RestController
@RequestMapping("api/monan")
public class MonAnController {
	private final MonAnRepository repo;
	
	@Autowired
    private MonAnService monAnService;
	
	public MonAnController(MonAnRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping
	public List<MonAn> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
    public MonAn insert(@RequestBody MonAn monAn) {
        try {
            return monAnService.insertMonAn(monAn);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi thêm món ăn: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public MonAn update(@PathVariable Long id, @RequestBody MonAn monAn) {
        try {
            return monAnService.updateMonAn(id, monAn);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi cập nhật món ăn: " + e.getMessage());
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            monAnService.deleteMonAn(id);
            return ResponseEntity.ok(Map.of("message", "Đã xoá sảnh thành công"));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy sảnh!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi xoá sảnh.");
        }
    }
}
