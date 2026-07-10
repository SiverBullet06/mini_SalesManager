package com.example.demo.SpringBoot__Core.miniQL_BanHang.service;


import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.HoaDon;
import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.Khach;
import com.example.demo.SpringBoot__Core.miniQL_BanHang.repository.HoadonRepository;
import com.example.demo.SpringBoot__Core.miniQL_BanHang.repository.KhachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HoadonService {
    @Autowired
    private final HoadonRepository hoadonRepository ;
    @Autowired
    private final KhachRepository khachRepository ;
    public HoadonService(HoadonRepository hoadonRepository ,
                         KhachRepository khachRepository) {
        this.hoadonRepository = hoadonRepository;
        this.khachRepository = khachRepository ;
    }

    public List <HoaDon > getAllHoadon () {
        return hoadonRepository.findAll() ;
    }
    public HoaDon getHoadonById  ( HoaDon request ) {
        return hoadonRepository.findById(request.getMaHd()).orElseThrow(
                () -> new RuntimeException("Ma hoa don khong ton tai ")
        ) ;
    }
//    @Transactional
//    public void deleteHoadon ( HoaDon request  ) {
//        HoaDon hoadon = hoadonRepository.findById(request.getMaHd()).orElseThrow(
//                () -> new RuntimeException("Ma hoa don khong ton tai trong he thong ")
//        ) ;
//        String maKh = request.getKhach().getMaKh();
//        hoadonRepository.delete(hoadon);
//
//        khachRepository.deleteById(maKh);
//
//    }
    public HoaDon addHoadon ( HoaDon request )  {
        if ( hoadonRepository.existsById(request.getMaHd())){
            throw new RuntimeException("Ma hoa don da ton tai ") ;
        }
        return hoadonRepository.save(request)  ;
    }
    public HoaDon updateHoadon ( HoaDon request ) {
        HoaDon hoadon = hoadonRepository.findById(request.getMaHd()).orElseThrow(
                () -> new RuntimeException("Ma hoa don khong ton tai trong he thong ")
        ) ;
        hoadon.setNgayLap(request.getNgayLap());
        return hoadonRepository.save(hoadon) ;
    }

}
