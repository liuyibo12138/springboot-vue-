package com.example.demo.config;

public class LeaseHome {
    private int leaseid;
    private int homeid;
    private int tenantid;

    private String hometype;
    private int homeprice;
    private String homeaddress;

    @Override
    public String toString() {
        return "LeaseHome{" +
                "leaseid=" + leaseid +
                ", homeid=" + homeid +
                ", tenantid=" + tenantid +
                ", hometype='" + hometype + '\'' +
                ", homeprice=" + homeprice +
                ", homeaddress='" + homeaddress + '\'' +
                '}';
    }

    public int getLeaseid() {
        return leaseid;
    }

    public void setLeaseid(int leaseid) {
        this.leaseid = leaseid;
    }

    public int getHomeid() {
        return homeid;
    }

    public void setHomeid(int homeid) {
        this.homeid = homeid;
    }

    public int getTenantid() {
        return tenantid;
    }

    public void setTenantid(int tenantid) {
        this.tenantid = tenantid;
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

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }
}
