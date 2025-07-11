package com.thangn260302.qltc.service;

import com.thangn260302.qltc.entity.NhanVien;
import com.thangn260302.qltc.entity.PhanCong;
import com.thangn260302.qltc.entity.PhanCongId;
import com.thangn260302.qltc.entity.PhieuDatTiecCuoi;
import com.thangn260302.qltc.repository.NhanVienRepository;
import com.thangn260302.qltc.repository.PhanCongRepository;
import com.thangn260302.qltc.repository.PhieuDatTiecCuoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhanCongService {

    @Autowired
    private PhanCongRepository phanCongRepository;

    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Autowired
    private PhieuDatTiecCuoiRepository tiecCuoiRepository;

    public List<PhanCong> getAll() {
        return phanCongRepository.findAll();
    }

    public PhanCong create(Long maNhanVien, Long maTiecCuoi) {
    	PhanCongId id = new PhanCongId(maNhanVien, maTiecCuoi);

        NhanVien nv = nhanVienRepository.findById(maNhanVien).orElseThrow();
        PhieuDatTiecCuoi tc = tiecCuoiRepository.findById(maTiecCuoi).orElseThrow();

        // 1. Tạo phân công mới
        PhanCong pc = new PhanCong();
        pc.setId(id);
        pc.setNhanVien(nv);
        pc.setTiecCuoi(tc);
        phanCongRepository.save(pc);

        // 2. Cập nhật tình trạng phân công cho tiệc cưới
        tc.setTinhTrangPhanCong(true);
        tiecCuoiRepository.save(tc);
        return pc;
    }

    public void delete(Long maNhanVien, Long maTiecCuoi) {
        PhanCongId id = new PhanCongId(maNhanVien, maTiecCuoi);
        phanCongRepository.deleteById(id);
    }

    public List<PhanCong> getByTiecCuoi(Long maTiecCuoi) {
        return phanCongRepository.findById_MaTiecCuoi(maTiecCuoi);
    }

    public List<PhanCong> getByNhanVien(Long maNhanVien) {
        return phanCongRepository.findById_MaNhanVien(maNhanVien);
    }
}
