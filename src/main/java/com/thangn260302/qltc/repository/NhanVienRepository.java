package com.thangn260302.qltc.repository;

import com.thangn260302.qltc.DTO.NhanVienDTO;
import com.thangn260302.qltc.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface NhanVienRepository extends CrudRepository<NhanVien, Long> {

	@Query("SELECT new com.thangn260302.qltc.DTO.NhanVienDTO(" +
		       "nv.maNhanVien, nv.tenNhanVien, nv.gioiTinh, nv.loaiNhanVien, nv.sdt, " +
		       "nv.congViec.id, pc.id.maTiecCuoi) " +
		       "FROM PhanCong pc JOIN pc.nhanVien nv")
		List<NhanVienDTO> findNhanVienDaPhanCong();
	
	@Query("SELECT new com.thangn260302.qltc.DTO.NhanVienDTO(" +
		       "nv.maNhanVien, nv.tenNhanVien, nv.gioiTinh, nv.loaiNhanVien, nv.sdt, " +
		       "nv.congViec.id, null) " +
		       "FROM NhanVien nv " +
		       "LEFT JOIN PhanCong pc ON pc.nhanVien = nv " +
		       "WHERE pc IS NULL")
		List<NhanVienDTO> findNhanVienChuaPhanCong();
	
}