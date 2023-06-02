package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class landlord {
    @Id
    private int landlordid;

    private String landlordname;

    private String landlordgender;

    private int landlordphone;

    public int getLandlordid() {
        return landlordid;
    }

    public void setLandlordid(int landlordid) {
        this.landlordid = landlordid;
    }

    public String getLandlordname() {
        return landlordname;
    }

    public void setLandlordname(String landlordname) {
        this.landlordname = landlordname;
    }

    public String getLandlordgender() {
        return landlordgender;
    }

    public void setLandlordgender(String landlordgender) {
        this.landlordgender = landlordgender;
    }

    public int getLandlordphone() {
        return landlordphone;
    }

    public void setLandlordphone(int landlordphone) {
        this.landlordphone = landlordphone;
    }

    @Override
    public String toString() {
        return "landlord{" +
                "landlordid=" + landlordid +
                ", landlordname='" + landlordname + '\'' +
                ", landlordgender='" + landlordgender + '\'' +
                ", landlordphone=" + landlordphone +
                '}';
    }
}

