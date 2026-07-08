package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="HANG")
public class Hang {
    @Id
    private String maHg ;
    @Column ( name = "TENHG")
    private String tenHg ;
    @Column ( name = "DVT")
    private String donviTinh ;
    @Column ( name ="NHASX")
    private String nhaSx ;

    public Hang() {
    }

    public Hang(String maHg, String tenHg, String donviTinh, String nhaSx) {
        this.maHg = maHg;
        this.tenHg = tenHg;
        this.donviTinh = donviTinh;
        this.nhaSx = nhaSx;
    }

    public String getMaHg() {
        return maHg;
    }

    public void setMaHg(String maHg) {
        this.maHg = maHg;
    }

    public String getTenHg() {
        return tenHg;
    }

    public void setTenHg(String tenHg) {
        this.tenHg = tenHg;
    }

    public String getDonviTinh() {
        return donviTinh;
    }

    public void setDonviTinh(String donviTinh) {
        this.donviTinh = donviTinh;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }
}
