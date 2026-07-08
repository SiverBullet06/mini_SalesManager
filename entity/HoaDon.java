package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name ="HOADON")
public class HoaDon {
    @Id
    @Column ( name = "MAHD")
    private String maHd ;
    @Column ( name = "NGAYLAP")
    private Date ngayLap ;

    @ManyToOne
    @JoinColumn (name = "MAKH")
    private Khach khach ;

    public HoaDon() {
    }

    public HoaDon(String maHd, Date ngayLap, Khach khach) {
        this.maHd = maHd;
        this.ngayLap = ngayLap;
        this.khach = khach;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Khach getKhach() {
        return khach;
    }

    public void setKhach(Khach khach) {
        this.khach = khach;
    }
}
