package com.thangn260302.qltc.service;

import com.thangn260302.qltc.entity.Ca;
import com.thangn260302.qltc.repository.CaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaService {
	private final CaRepository caRepository;

    public CaService(CaRepository caRepository) {
        this.caRepository = caRepository;
    }

    public List<Ca> getAll() {
        return caRepository.findAll();
    }

    public Optional<Ca> getById(Long id) {
        return caRepository.findById(id);
    }

    public Ca insert(Ca ca) {
        return caRepository.save(ca);
    }

    public Ca update(Long id, Ca updated) {
        Optional<Ca> existing = caRepository.findById(id);
        if (existing.isPresent()) {
            Ca ca = existing.get();
            ca.setTenCa(updated.getTenCa());
            ca.setGioBatDau(updated.getGioBatDau());
            ca.setGioKetThuc(updated.getGioKetThuc());
            return caRepository.save(ca);
        } else {
            throw new RuntimeException("Không tìm thấy ca có ID = " + id);
        }
    }

    public void delete(Long id) {
        if (caRepository.existsById(id)) {
            caRepository.deleteById(id);
        } else {
            throw new RuntimeException("Không tìm thấy ca có ID = " + id);
        }
    }
}
