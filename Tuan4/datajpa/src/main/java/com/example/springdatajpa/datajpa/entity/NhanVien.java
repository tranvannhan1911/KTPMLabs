package com.example.springdatajpa.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class NhanVien {

    @Id
    @GeneratedValue
    @Column(name="MaNV")
    private long maNV;
    
    @Column(name="Ten")
    private String ten;

    @Column(name="Luong")
    private int luong;
}
