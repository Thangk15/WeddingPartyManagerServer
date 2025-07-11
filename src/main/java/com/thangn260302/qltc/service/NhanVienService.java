package com.thangn260302.qltc.service;

import com.thangn260302.qltc.DTO.NhanVienDTO;
import com.thangn260302.qltc.repository.NhanVienRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NhanVienService {

    private final NhanVienRepository nhanVienRepository;

    public NhanVienService(NhanVienRepository nhanVienRepository) {
        this.nhanVienRepository = nhanVienRepository;
    }

    public List<NhanVienDTO> getNhanVienDaPhanCong() {
        return nhanVienRepository.findNhanVienDaPhanCong();
    }
    
    public List<NhanVienDTO> getNhanVienChuaPhanCong() {
        return nhanVienRepository.findNhanVienChuaPhanCong();
    }
}
