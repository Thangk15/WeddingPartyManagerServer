package com.thangn260302.qltc.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

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

import com.thangn260302.qltc.entity.Sanh;
import com.thangn260302.qltc.repository.SanhRepository;
import com.thangn260302.qltc.service.SanhService;

@RestController
@RequestMapping("api/sanh")
public class SanhController {
	private final SanhRepository repo;
	
	public SanhController(SanhRepository repo) {
		this.repo = repo;
	}
	
	@Autowired
	private SanhService sanhService;
	
	@GetMapping
	public List<Sanh> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
    public ResponseEntity<Sanh> createSanh(@RequestBody Sanh sanh) {
        try {
        	Sanh saved = repo.save(sanh);
            return ResponseEntity.ok(saved);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi thêm sảnh: " + e.getMessage());
        }
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSanh(@PathVariable Long id) {
        try {
            sanhService.deleteSanh(id);
            return ResponseEntity.ok(Map.of("message", "Đã xoá sảnh thành công"));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy sảnh!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi xoá sảnh.");
        }
    }
	
	@PutMapping("/{id}")
	public ResponseEntity<Sanh> updateSanh(@PathVariable Long id, @RequestBody Sanh sanhMoi) {

	    try {
		    Sanh updated = sanhService.updateSanh(id, sanhMoi);
		    return ResponseEntity.ok(updated);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi sửa sảnh: " + e.getMessage());
        }
	}
}
