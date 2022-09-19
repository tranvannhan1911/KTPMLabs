package com.example.springdatajpa.datajpa.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChuyenBay")
public class ChuyenBay {
    @Id
    @GeneratedValue
    @Column(name="MaCB")
    private long maCB;
    
    @Column(name="GaDi")
    private String gaDi;

    @Column(name="GaDen")
    private String gaDen;
    
    @Column(name="DoDai")
    private float doDai;
    
    @Column(name="GioDi")
    private Date gioDi;
    
    @Column(name="GioDen")
    private Date gioDen;
}
