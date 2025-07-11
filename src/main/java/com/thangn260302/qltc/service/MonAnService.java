package com.thangn260302.qltc.service;

import com.thangn260302.qltc.entity.MonAn;
import com.thangn260302.qltc.repository.MonAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MonAnService {

    @Autowired
    private MonAnRepository monAnRepository;

    public MonAn insertMonAn(MonAn monAn) {
        return monAnRepository.save(monAn);
    }

    public MonAn updateMonAn(Long id, MonAn updated) {
        Optional<MonAn> existing = monAnRepository.findById(id);
        if (existing.isPresent()) {
            MonAn monAn = existing.get();
            monAn.setTenMonAn(updated.getTenMonAn());
            monAn.setDonGia(updated.getDonGia());
            monAn.setTenLoaiMonAn(updated.getTenLoaiMonAn());
            return monAnRepository.save(monAn);
        } else {
            throw new RuntimeException("Không tìm thấy món ăn có ID = " + id);
        }
    }
    
    public void deleteMonAn(Long id) {
        if (monAnRepository.existsById(id)) {
            monAnRepository.deleteById(id);
        } else {
            throw new RuntimeException("Không tìm thấy món ăn có ID = " + id);
        }
    }
}
