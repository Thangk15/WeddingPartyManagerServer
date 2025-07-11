package com.thangn260302.qltc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangn260302.qltc.entity.DichVu;
import com.thangn260302.qltc.repository.DichVuRepository;

@RestController
@RequestMapping("api/dichvu")
public class DichVuController {
	private final DichVuRepository repo;
	
	public DichVuController(DichVuRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping
	public List<DichVu> getAll() {
		return repo.findAll();
	}
}
