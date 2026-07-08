package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="HANG")
public class Khach {
    @Id
    @Column(name = "MAKH")
    private String maKh ;
    @Column (name ="TENKH")
    private String tenKh ;
    @Column (name = "DIACHI")
    private String diaChi ;
    @Column ( name = "DIENTHOAI")
    private String dienThoai ;

    public Khach() {
    }

    public Khach(String maKh, String tenKh, String diaChi, String dienThoai) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
}
