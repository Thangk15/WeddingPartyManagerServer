package com.thangn260302.qltc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thangn260302.qltc.DTO.SoLuongTiecTheoThangDTO;
import com.thangn260302.qltc.DTO.ThongTinTiecCuoiTimKiemDTO;
import com.thangn260302.qltc.DTO.TiecCuoiThongTinDonGianDTO;
import com.thangn260302.qltc.entity.PhieuDatTiecCuoi;

public interface PhieuDatTiecCuoiRepository extends JpaRepository<PhieuDatTiecCuoi, Long> {
	
	@Query("SELECT new com.thangn260302.qltc.DTO.ThongTinTiecCuoiTimKiemDTO(" +
		       "p.maTiecCuoi, s.maSanh, p.ngayDat, p.ngayDaiTiec, c.tenCa, p.soLuongBan, p.soLuongBanDuTru, " +
		       "p.donGiaBan, p.tongTienBan, p.tongTienDichVu, p.tongTienDatTiec, p.tienDatCoc, " +
		       "p.conLai, p.tenCoDau, p.tenChuRe, p.sdt, c.gioBatDau, p.tinhTrangPhanCong, s.tenSanh, tk.userName) " +
		       "FROM PhieuDatTiecCuoi p " +
		       "JOIN p.sanh s " +
		       "JOIN p.ca c " +
		       "JOIN p.taiKhoan tk " +
		       "ORDER BY p.maTiecCuoi ASC")
	List<ThongTinTiecCuoiTimKiemDTO> getAllTiecCuoiTimKiem();

    @Query("SELECT p FROM PhieuDatTiecCuoi p WHERE YEAR(p.ngayDaiTiec) = :year")
    List<PhieuDatTiecCuoi> findByNgayDaiTiecYear(@Param("year") int year);
    
    @Query("SELECT new com.thangn260302.qltc.DTO.SoLuongTiecTheoThangDTO(MONTH(p.ngayDaiTiec), COUNT(p)) " +
    	       "FROM PhieuDatTiecCuoi p " +
    	       "WHERE YEAR(p.ngayDaiTiec) = :year " +
    	       "GROUP BY MONTH(p.ngayDaiTiec) " +
    	       "ORDER BY MONTH(p.ngayDaiTiec)")
    List<SoLuongTiecTheoThangDTO> demSoLuongTiecTheoThang(@Param("year") int year);
    
    
    List<PhieuDatTiecCuoi> findByNgayDaiTiecBetween(LocalDate selectedFromDate, LocalDate selectedToDate);
    
    @Query("SELECT new com.thangn260302.qltc.DTO.TiecCuoiThongTinDonGianDTO(" +
            "p.id, p.ngayDaiTiec, p.ca.tenCa, p.sanh.id, p.soLuongBan, p.tinhTrangPhanCong) " +
            "FROM PhieuDatTiecCuoi p " +
            "WHERE p.ngayDaiTiec BETWEEN :fromDate AND :toDate")
	List<TiecCuoiThongTinDonGianDTO> findThongTinDonGianTrongKhoang(
    	    @Param("fromDate") LocalDate fromDate,
    	    @Param("toDate") LocalDate toDate);
}