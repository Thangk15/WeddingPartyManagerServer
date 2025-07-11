package com.thangn260302.qltc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.thangn260302.qltc.entity.CongViec;

public interface CongViecRepository extends JpaRepository<CongViec, Long> {
    // JpaRepository đã có sẵn findAll(), không cần viết gì thêm
}
