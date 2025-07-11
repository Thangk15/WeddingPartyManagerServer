package com.thangn260302.qltc.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangn260302.qltc.entity.Sanh;
import com.thangn260302.qltc.repository.SanhRepository;

@Service
public class SanhService {

    @Autowired
    private SanhRepository sanhRepository;

    public void deleteSanh(Long id) {
        if (!sanhRepository.existsById(id)) {
            throw new NoSuchElementException("Không tìm thấy sảnh có ID: " + id);
        }
        sanhRepository.deleteById(id);
    }
    
    public Sanh updateSanh(Long id, Sanh sanhMoi) {
        return sanhRepository.findById(id).map(sanh -> {
            sanh.setTenSanh(sanhMoi.getTenSanh());
            sanh.setDonGiaBanToiThieu(sanhMoi.getDonGiaBanToiThieu());
            sanh.setSoLuongBanToiDa(sanhMoi.getSoLuongBanToiDa());
            return sanhRepository.save(sanh);
        }).orElseThrow(() -> new RuntimeException("Không tìm thấy sảnh với ID: " + id));
    }
}