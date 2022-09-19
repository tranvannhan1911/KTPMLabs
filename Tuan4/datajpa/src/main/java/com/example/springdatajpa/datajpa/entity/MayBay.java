package com.example.springdatajpa.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MayBay {
    @Id
    @GeneratedValue
    @Column(name="MaMB")
    private long maMB;
    
    @Column(name="Loai")
    private String loai;

    @Column(name="TamBay")
    private int tamBay;
}
