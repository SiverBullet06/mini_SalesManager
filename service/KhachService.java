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
        return khachRepository.findById(id).orElseThrow(()
        -> new RuntimeException("Khong co ma khach trong he trong ")) ;
    }

    public boolean checkExistsKhach ( String id ) {
        if ( khachRepository.existsById(id )){
            return true ;
        }
        return false ;
    }

    public Khach updateKhach ( String id , Khach request ) {
        Khach khach = khachRepository.findById(id)
                .orElseThrow(()
                -> new RuntimeException("Khong tim thay ma khach hang "));
        khach.setTenKh(request.getTenKh());
        khach.setDiaChi(request.getDiaChi());
        khach.setDienThoai(request.getDienThoai());
        return khachRepository.save(khach) ;
    }
    public Khach addKhach ( Khach request ) {
        if (checkExistsKhach(request.getMaKh())) {
            throw new RuntimeException("Ma khach hang da ton tai trong du lieu ") ;
        }
        return khachRepository.save(request) ;
    }
    public void deleteKhach ( Khach request ) {
        Khach khach = khachRepository.findById(request.getMaKh())
                .orElseThrow(()
                        -> new RuntimeException("Khong tim thay ma khach hang "));
        khachRepository.delete(khach);
    }

//    public Khach addOrUpdateKhach(String id, Khach request) {
//        // Trường hợp 1: Có ID truyền vào -> Thực hiện UPDATE
//        if (id != null && !id.trim().isEmpty()) {
//            return khachRepository.findById(id)
//                    .map(khach -> {
//                        khach.setMaKh(request.getMaKh());
//                        khach.setTenKh(request.getTenKh());
//                        khach.setDiaChi(request.getDiaChi());
//                        khach.setDienThoai(request.getDienThoai());
//                        return khachRepository.save(khach);
//                    })
//                    .orElseGet(() -> {
//                        // Nếu có ID nhưng tìm trong DB không thấy, bạn có thể chọn:
//                        // Cách A: Coi như thêm mới (Lưu request)
//                        return khachRepository.save(request);
//                        // Cách B: Ném lỗi (Tùy bạn chọn bài toán nào)
//                        // throw new RuntimeException("ID không tồn tại");
//                    });
//        }
//
//        // Trường hợp 2: Không có ID truyền vào -> Thực hiện ADD (Thêm mới)
//        return khachRepository.save(request);
//    }



}
