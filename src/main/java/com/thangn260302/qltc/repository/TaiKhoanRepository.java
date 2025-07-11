package com.thangn260302.qltc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thangn260302.qltc.entity.TaiKhoan;

import java.util.Optional;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, String> {
    Optional<TaiKhoan> findByUserName(String userName);  // <- đúng
}