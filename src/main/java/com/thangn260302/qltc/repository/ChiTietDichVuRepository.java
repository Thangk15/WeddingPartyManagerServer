package com.thangn260302.qltc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thangn260302.qltc.DTO.DichVuSuDungDTO;
import com.thangn260302.qltc.DTO.ThongKeCongViecDTO;
import com.thangn260302.qltc.entity.ChiTietDichVu;
import com.thangn260302.qltc.entity.ChiTietDichVuId;

public interface ChiTietDichVuRepository extends JpaRepository<ChiTietDichVu, ChiTietDichVuId> {
    
    List<ChiTietDichVu> findById_MaTiecCuoi(Long maTiecCuoi);

    @Query("SELECT new com.thangn260302.qltc.DTO.DichVuSuDungDTO(" +
    	       "ctd.dichVu.maDichVu, " +
    	       "ctd.dichVu.tenDichVu, " +
    	       "ctd.dichVu.donGia, " +
    	       "ctd.soLuong, " +
    	       "ctd.dichVu.congViec.maCongViec, " +
    	       "ctd.dichVu.congViec.tenCongViec) " +
    	       "FROM ChiTietDichVu ctd " +
    	       "WHERE ctd.id.maTiecCuoi = :maTiecCuoi")
    List<DichVuSuDungDTO> findDichVuByMaTiecCuoi(@Param("maTiecCuoi") Long maTiecCuoi);
    
    @Query("SELECT new com.thangn260302.qltc.DTO.ThongKeCongViecDTO(" +
    	       "dv.congViec.maCongViec, " +
    	       "dv.congViec.tenCongViec, " +
    	       "COUNT(dv)) " +
    	       "FROM ChiTietDichVu ctd " +
    	       "JOIN ctd.dichVu dv " +
    	       "WHERE ctd.id.maTiecCuoi = :maTiecCuoi " +
    	       "GROUP BY dv.congViec.maCongViec, dv.congViec.tenCongViec")
	List<ThongKeCongViecDTO> thongKeDichVuTheoCongViec(@Param("maTiecCuoi") Long maTiecCuoi);

}