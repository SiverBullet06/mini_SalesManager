package com.example.demo.SpringBoot__Core.miniQL_BanHang.service;

import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.Khach;
import com.example.demo.SpringBoot__Core.miniQL_BanHang.repository.KhachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachService {
    private final KhachRepository khachRepository ;
    @Autowired
    public KhachService(KhachRepository khachRepository) {
        this.khachRepository = khachRepository;
    }

    public List<Khach> getAllKhach () {
        return khachRepository.findAll() ;
    }
    public Khach getOneById ( String id ) {
        return khachRepository.findById(id).orElse(null) ;
    }
    public int  countSoLuong ( ) {
        return khachRepository.count() ;
    }

}
