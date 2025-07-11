package com.thangn260302.qltc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangn260302.qltc.entity.CongViec;
import com.thangn260302.qltc.repository.CongViecRepository;

@Service
public class CongViecService {

    @Autowired
    private CongViecRepository congViecRepository;

    public List<CongViec> getAllCongViec() {
        return congViecRepository.findAll();
    }
    
    public Optional<CongViec> getById(Long id) {
        return congViecRepository.findById(id);
    }

    public CongViec insert(CongViec congViec) {
        return congViecRepository.save(congViec);
    }

    public CongViec updateCongViec(Long id, CongViec updated) {
        Optional<CongViec> existing = congViecRepository.findById(id);
        if (existing.isPresent()) {
            CongViec congViec = existing.get();
            congViec.setTenCongViec(updated.getTenCongViec());
            return congViecRepository.save(congViec);
        } else {
            throw new RuntimeException("Không tìm thấy công việc với ID = " + id);
        }
    }


    public void delete(Long id) {
        if (congViecRepository.existsById(id)) {
            congViecRepository.deleteById(id);
        } else {
            throw new RuntimeException("Không tìm thấy công việc để xóa với id = " + id);
        }
    }
}