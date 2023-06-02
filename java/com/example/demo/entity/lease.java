package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class lease {
    @Id
    private int leaseid;

    private int homeid;

    private int penanid;

    private String begintime;

    private String deadline;

    @Override
    public String toString() {
        return "lease{" +
                "leaseid=" + leaseid +
                ", homeid=" + homeid +
                ", penanid=" + penanid +
                ", begintime='" + begintime + '\'' +
                ", deadline='" + deadline + '\'' +
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

    public int getPenanid() {
        return penanid;
    }

    public void setPenanid(int penanid) {
        this.penanid = penanid;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
