package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class home {
    @Id
    private int homeid;

    private String homeaddress;

    private int homesize;

    private String hometype;

    private int homeprice;

    private int landlordid;

    @Override
    public String toString() {
        return "home{" +
                "homeid=" + homeid +
                ", homeaddress='" + homeaddress + '\'' +
                ", homesize=" + homesize +
                ", hometype='" + hometype + '\'' +
                ", homeprice=" + homeprice +
                ", landlordid='" + landlordid + '\'' +
                '}';
    }

    public int getHomeid() {
        return homeid;
    }

    public void setHomeid(int homeid) {
        this.homeid = homeid;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public int getHomesize() {
        return homesize;
    }

    public void setHomesize(int homesize) {
        this.homesize = homesize;
    }

    public String getHometype() {
        return hometype;
    }

    public void setHometype(String hometype) {
        this.hometype = hometype;
    }

    public int getHomeprice() {
        return homeprice;
    }

    public void setHomeprice(int homeprice) {
        this.homeprice = homeprice;
    }

    public int getlandlordid() {
        return landlordid;
    }

    public void setlandlordid(int landlordid) {
        this.landlordid = landlordid;
    }
}
