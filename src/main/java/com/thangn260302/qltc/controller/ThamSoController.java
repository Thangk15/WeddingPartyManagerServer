package com.thangn260302.qltc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangn260302.qltc.entity.ThamSo;
import com.thangn260302.qltc.repository.CaRepository;
import com.thangn260302.qltc.repository.ThamSoRepository;

@RestController
@RequestMapping("api/thamso")
public class ThamSoController {
	private final ThamSoRepository repo;
	
	public ThamSoController(ThamSoRepository repo) {
		this.repo = repo;
	}
	
	
	@GetMapping
	public List<ThamSo> getAll() {
		return repo.findAll();
	}
}
