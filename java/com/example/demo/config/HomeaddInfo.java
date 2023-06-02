package com.example.demo.config;

public class HomeaddInfo {
    private int landlordid;

    private int homeid;
    private String homeaddress;
    private String homesize;

    @Override
    public String toString() {
        return "HomeaddInfo{" +
                "landlordid=" + landlordid +
                ", homeid=" + homeid +
                ", homeaddress='" + homeaddress + '\'' +
                ", homesize='" + homesize + '\'' +
                ", hometype='" + hometype + '\'' +
                ", homeprice='" + homeprice + '\'' +
                '}';
    }

    public int getLandlordid() {
        return landlordid;
    }

    public void setLandlordid(int landlordid) {
        this.landlordid = landlordid;
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

    public String getHomesize() {
        return homesize;
    }

    public void setHomesize(String homesize) {
        this.homesize = homesize;
    }

    public String getHometype() {
        return hometype;
    }

    public void setHometype(String hometype) {
        this.hometype = hometype;
    }

    public String getHomeprice() {
        return homeprice;
    }

    public void setHomeprice(String homeprice) {
        this.homeprice = homeprice;
    }

    private String hometype;
    private String homeprice;
}