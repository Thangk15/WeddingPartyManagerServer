package com.thangn260302.qltc.repository;

import com.thangn260302.qltc.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Không cần viết gì thêm nếu chỉ CRUD
}