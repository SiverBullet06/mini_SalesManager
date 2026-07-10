package com.example.demo.SpringBoot__Core.miniQL_BanHang.service;

import com.example.demo.SpringBoot__Core.miniQL_BanHang.entity.Hang;
import com.example.demo.SpringBoot__Core.miniQL_BanHang.repository.HangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangService {
    private final HangRepository hangRepository ;
    @Autowired
    public HangService(HangRepository hangRepository) {
        this.hangRepository = hangRepository;
    }

    public List<Hang> getAllHang () {
        return hangRepository.findAll() ;
    }
    public Hang getHangById (Hang request ) {
        return hangRepository.findById(request.getMaHg()).orElseThrow(
                () -> new RuntimeException("Ma hang khong ton tai ")
        ) ;
    }
    public Hang addHang (Hang request ) {
        if (hangRepository.existsById(request.getMaHg()) )
        {
            throw new RuntimeException("Ma hang da  ton tai ") ;
        }
        return hangRepository.save(request ) ;
    }
    public Hang updateHang ( Hang request ) {
        Hang hang = hangRepository.findById(request.getMaHg()).orElseThrow(
                () -> new RuntimeException("Ma hang khong ton tai ")
        );
        hang.setTenHg(request.getTenHg());
        hang.setDonviTinh(request.getDonviTinh());
        hang.setNhaSx(request.getNhaSx());
        return hangRepository.save(hang) ;
    }
    public void deleteHang ( Hang request ) {
        Hang hang = hangRepository.findById(request.getMaHg()).orElseThrow(
                () -> new RuntimeException("Ma hang khong ton tai ")
        );
        hangRepository.delete(hang );
    }
}
