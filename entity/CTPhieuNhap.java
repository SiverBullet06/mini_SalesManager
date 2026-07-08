package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import com.beust.jcommander.internal.Maps;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table( name = "CHITIETPN")
public class CTPhieuNhap {
    @Id
    @Column ( name = "MAPN")
    private String maPn ;
    @Id
    @Column ( name = "MAHG")
    private String maHg ;
    @Column ( name = "SOLUONG")
    private  int soLuong ;
    @Column (name = "GIANHAP")
    private BigDecimal giaNhap ;

    @OneToOne
    @MapsId
    @JoinColumn (name = "MAPN")
    private PhieuNhap pn ;

    @OneToOne
    @MapsId
    @JoinColumn ( name = "MAHG")
    private Hang h ;

    public CTPhieuNhap() {
    }

    public CTPhieuNhap(String maPn, String maHg, int soLuong, BigDecimal giaNhap, PhieuNhap pn, Hang h) {
        this.maPn = maPn;
        this.maHg = maHg;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.pn = pn;
        this.h = h;
    }

    public String getMaPn() {
        return maPn;
    }

    public void setMaPn(String maPn) {
        this.maPn = maPn;
    }

    public String getMaHg() {
        return maHg;
    }

    public void setMaHg(String maHg) {
        this.maHg = maHg;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public PhieuNhap getPn() {
        return pn;
    }

    public void setPn(PhieuNhap pn) {
        this.pn = pn;
    }

    public Hang getH() {
        return h;
    }

    public void setH(Hang h) {
        this.h = h;
    }
}
