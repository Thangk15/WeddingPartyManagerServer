package com.thangn260302.qltc.repository;

import com.thangn260302.qltc.entity.PhanCong;
import com.thangn260302.qltc.entity.PhanCongId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhanCongRepository extends JpaRepository<PhanCong, PhanCongId> {
    List<PhanCong> findById_MaTiecCuoi(Long maTiecCuoi);
    List<PhanCong> findById_MaNhanVien(Long maNhanVien);
}
	