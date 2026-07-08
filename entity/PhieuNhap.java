package com.example.demo.SpringBoot__Core.miniQL_BanHang.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table ( name = "PHIEUNHAP")
public class PhieuNhap {
    @Id
    @Column( name ="MAPN")
    private String maPn ;
    @Column ( name = "NGAYLAP")
    private Date ngayLap ;
    @Column ( name ="MANCC")
    private String maNcc ;

    public PhieuNhap() {
    }

    public PhieuNhap(String maPn, Date ngayLap, String maNcc) {
        this.maPn = maPn;
        this.ngayLap = ngayLap;
        this.maNcc = maNcc;
    }

    public String getMaPn() {
        return maPn;
    }

    public void setMaPn(String maPn) {
        this.maPn = maPn;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaNcc() {
        return maNcc;
    }

    public void setMaNcc(String maNcc) {
        this.maNcc = maNcc;
    }
}
