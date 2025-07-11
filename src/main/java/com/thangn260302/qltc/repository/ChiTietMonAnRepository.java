package com.thangn260302.qltc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thangn260302.qltc.DTO.ChiTietMonAnDTO;
import com.thangn260302.qltc.entity.ChiTietMonAn;

public interface ChiTietMonAnRepository extends JpaRepository<ChiTietMonAn, Long>{
	@Query("SELECT new com.thangn260302.qltc.DTO.ChiTietMonAnDTO(" +
		       "m.id, m.tenMonAn, m.tenLoaiMonAn, c.soLuong, c.donGiaMonAn) " +
		       "FROM ChiTietMonAn c " +
		       "JOIN c.monAn m " +
		       "WHERE c.tiecCuoi.maTiecCuoi = :maTiecCuoi")
	List<ChiTietMonAnDTO> findChiTietMonAnByMaTiecCuoi(@Param("maTiecCuoi") Long maTiecCuoi);
}
