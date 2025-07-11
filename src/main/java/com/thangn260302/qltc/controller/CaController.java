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

import com.thangn260302.qltc.entity.Ca;
import com.thangn260302.qltc.entity.MonAn;
import com.thangn260302.qltc.repository.CaRepository;
import com.thangn260302.qltc.service.CaService;
import com.thangn260302.qltc.service.MonAnService;

@RestController
@RequestMapping("api/ca")
public class CaController {
	private final CaRepository repo;
	
	@Autowired
    private CaService caService;
	
	public CaController(CaRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping
	public List<Ca> getAll() {
		return repo.findAll();
	}

    @PostMapping
    public Ca insert(@RequestBody Ca ca) {
        try {
            return caService.insert(ca);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi thêm ca: " + e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public Ca update(@PathVariable Long id, @RequestBody Ca ca) {
    	try {
            return caService.update(id, ca);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi cập nhật ca: " + e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        try {
            caService.delete(id);
            return ResponseEntity.ok(Map.of("message", "Đã xoá ca thành công"));
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Không tìm thấy ca!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi hệ thống khi xoá ca.");
        }
    }
}
