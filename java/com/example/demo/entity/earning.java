package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class earning {
    @Id
    private int earningid;

    private int homeid;

    private int earningmoney;

    @Override
    public String toString() {
        return "earning{" +
                "earningid=" + earningid +
                ", homeid=" + homeid +
                ", earningmoney=" + earningmoney +
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
}
