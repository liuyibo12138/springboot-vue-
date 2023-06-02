package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class billing {
    @Id
    private int billingid;

    private int leaseid;

    private int billingmoney;

    private String billingtime;

    @Override
    public String toString() {
        return "billing{" +
                "billingid=" + billingid +
                ", leaseid=" + leaseid +
                ", billingmoney=" + billingmoney +
                ", billingtime='" + billingtime + '\'' +
                '}';
    }

    public int getBillingid() {
        return billingid;
    }

    public void setBillingid(int billingid) {
        this.billingid = billingid;
    }

    public int getLeaseid() {
        return leaseid;
    }

    public void setLeaseid(int leaseid) {
        this.leaseid = leaseid;
    }

    public int getBillingmoney() {
        return billingmoney;
    }

    public void setBillingmoney(int billingmoney) {
        this.billingmoney = billingmoney;
    }

    public String getBillingtime() {
        return billingtime;
    }

    public void setBillingtime(String billingtime) {
        this.billingtime = billingtime;
    }
}
