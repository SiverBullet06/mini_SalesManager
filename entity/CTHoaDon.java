package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table ( name = "CHITIETHD")
public class CTHoaDon {
    @Id
    @Column ( name = "MAHD")
    private String maHd ;
    @Id
    @Column (name ="MAHG")
    private String maKh ;
    @Column ( name = "SOLUONG")
    private int soLuong ;
    @Column ( name ="GIABAN")
    private BigDecimal giaBan ;


    @OneToOne
    @MapsId
    @JoinColumn (name ="MAHD")
    private HoaDon hd ;
    @OneToOne
    @MapsId
    @JoinColumn ( name ="MAHG")
    private Hang h ;

    public CTHoaDon() {
    }

    public CTHoaDon(String maHd, String maKh, int soLuong, BigDecimal giaBan, HoaDon hd, Hang h) {
        this.maHd = maHd;
        this.maKh = maKh;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.hd = hd;
        this.h = h;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public HoaDon getHd() {
        return hd;
    }

    public void setHd(HoaDon hd) {
        this.hd = hd;
    }

    public Hang getH() {
        return h;
    }

    public void setH(Hang h) {
        this.h = h;
    }
}
