package com.example.demo.config;

public class LeaseDelete {
    private int homeid;

    public int getHomeid() {
        return homeid;
    }

    @Override
    public String toString() {
        return "LeaseDelete{" +
                "homeid=" + homeid +
                '}';
    }

    public void setHomeid(int homeid) {
        this.homeid = homeid;
    }
}
