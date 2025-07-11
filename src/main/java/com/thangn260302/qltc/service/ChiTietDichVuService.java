package com.thangn260302.qltc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangn260302.qltc.DTO.DichVuSuDungDTO;
import com.thangn260302.qltc.DTO.ThongKeCongViecDTO;
import com.thangn260302.qltc.entity.ChiTietDichVu;
import com.thangn260302.qltc.repository.ChiTietDichVuRepository;

@Service
public class ChiTietDichVuService {

    private final ChiTietDichVuRepository chiTietDichVuRepository;

    @Autowired
    public ChiTietDichVuService(ChiTietDichVuRepository chiTietDichVuRepository) {
        this.chiTietDichVuRepository = chiTietDichVuRepository;
    }
    
    public List<ChiTietDichVu> getChiTietByTiecCuoi(Long maTiecCuoi) {
        return chiTietDichVuRepository.findById_MaTiecCuoi(maTiecCuoi);
    }

    public List<DichVuSuDungDTO> getDichVuByTiecCuoi(Long maTiecCuoi) {
        return chiTietDichVuRepository.findDichVuByMaTiecCuoi(maTiecCuoi);
    }
    
    public List<ThongKeCongViecDTO> thongKeTheoTiecCuoi(Long maTiecCuoi) {
        return chiTietDichVuRepository.thongKeDichVuTheoCongViec(maTiecCuoi);
    }
}
