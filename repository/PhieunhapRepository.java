package com.example.demo.SpringBoot__Core.miniQL_BanHang.repository;

import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieunhapRepository
            extends JpaRepository<PhieuNhap, String > {
}
