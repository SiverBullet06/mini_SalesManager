package com.example.demo.SpringBoot__Core.miniQL_BanHang.repository;

import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoadonRepository
        extends JpaRepository<HoaDon , String > {
}
