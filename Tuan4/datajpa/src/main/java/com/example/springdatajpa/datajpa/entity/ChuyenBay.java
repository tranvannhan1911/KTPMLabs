package com.example.springdatajpa.datajpa.entity;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize
@Entity
@Table(name="ChuyenBay")
public class ChuyenBay {
    @Id
    @Column(name="MaCB")
    private String maCB;
    
    @Column(name="GaDi")
    private String gaDi;

    @Column(name="GaDen")
    private String gaDen;
    
    @Column(name="DoDai")
    private float doDai;
    
    @Column(name="GioDi")
    private Time gioDi;
    
    @Column(name="GioDen")
    private Time gioDen;
    
    @Column(name="ChiPhi")
    private Date chiPhi;
    
    public ChuyenBay() {
    	
    }

	public ChuyenBay(String maCB, String gaDi, String gaDen, float doDai, Time gioDi, Time gioDen, Date chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}

	public String getMaCB() {
		return maCB;
	}

	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}

	public String getGaDi() {
		return gaDi;
	}

	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}

	public String getGaDen() {
		return gaDen;
	}

	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}

	public float getDoDai() {
		return doDai;
	}

	public void setDoDai(float doDai) {
		this.doDai = doDai;
	}

	public Time getGioDi() {
		return gioDi;
	}

	public void setGioDi(Time gioDi) {
		this.gioDi = gioDi;
	}

	public Time getGioDen() {
		return gioDen;
	}

	public void setGioDen(Time gioDen) {
		this.gioDen = gioDen;
	}

	public Date getChiPhi() {
		return chiPhi;
	}

	public void setChiPhi(Date chiPhi) {
		this.chiPhi = chiPhi;
	}
    
    
}
