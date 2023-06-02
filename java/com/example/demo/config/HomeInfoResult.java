package com.example.demo.config;

public class HomeInfoResult {
    private int homeid;

    private String homeaddress;

    private int homesize;

    private String hometype;

    private int homeprice;

    private String homeowner;

    @Override
    public String toString() {
        return "HomeInfoResult{" +
                "homeid=" + homeid +
                ", homeaddress='" + homeaddress + '\'' +
                ", homesize=" + homesize +
                ", hometype='" + hometype + '\'' +
                ", homeprice=" + homeprice +
                ", homeowner='" + homeowner + '\'' +
                ", landlordphone=" + landlordphone +
                '}';
    }

    private int landlordphone;

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

    public String getHomeowner() {
        return homeowner;
    }

    public void setHomeowner(String homeowner) {
        this.homeowner = homeowner;
    }


    public int getLandlordphone() {
        return landlordphone;
    }

    public void setLandlordphone(int landlordphone) {
        this.landlordphone = landlordphone;
    }
}
