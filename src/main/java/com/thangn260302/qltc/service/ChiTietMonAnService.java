package com.thangn260302.qltc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangn260302.qltc.DTO.ChiTietMonAnDTO;
import com.thangn260302.qltc.repository.ChiTietMonAnRepository;

@Service
public class ChiTietMonAnService {
	@Autowired
    private ChiTietMonAnRepository chiTietMonAnRepository;

    public List<ChiTietMonAnDTO> getMonAnTheoTiecCuoi(Long maTiecCuoi) {
        return chiTietMonAnRepository.findChiTietMonAnByMaTiecCuoi(maTiecCuoi);
    }
}
