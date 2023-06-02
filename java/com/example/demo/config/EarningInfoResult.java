package com.example.demo.config;

public class EarningInfoResult {
    private int earningid;

    private int homeid;

    private int earningmoney;

    private int homesize;

    private String hometype;

    @Override
    public String toString() {
        return "EarningInfoResult{" +
                "earningid=" + earningid +
                ", homeid=" + homeid +
                ", earningmoney=" + earningmoney +
                ", homesize=" + homesize +
                ", hometype='" + hometype + '\'' +
                '}';
    }

    public int getEarningid() {
        return earningid;
    }

    public void setEarningid(int earningid) {
        this.earningid = earningid;
    }

    public int getHomeid() {
        return homeid;
    }

    public void setHomeid(int homeid) {
        this.homeid = homeid;
    }

    public int getEarningmoney() {
        return earningmoney;
    }

    public void setEarningmoney(int earningmoney) {
        this.earningmoney = earningmoney;
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
}
