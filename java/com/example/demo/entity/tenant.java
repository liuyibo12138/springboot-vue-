package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tenant {
    @Id
    private int tenantid;

    private String tenantname;

    private String tenantgender;

    private String tenantphone;

    @Override
    public String toString() {
        return "tenant{" +
                "tenantid=" + tenantid +
                ", tenantname='" + tenantname + '\'' +
                ", tenantgender='" + tenantgender + '\'' +
                ", tenantphone='" + tenantphone + '\'' +
                '}';
    }

    public int getTenantid() {
        return tenantid;
    }

    public void setTenantid(int tenantid) {
        this.tenantid = tenantid;
    }

    public String getTenantname() {
        return tenantname;
    }

    public void setTenantname(String tenantname) {
        this.tenantname = tenantname;
    }

    public String getTenantgender() {
        return tenantgender;
    }

    public void setTenantgender(String tenantgender) {
        this.tenantgender = tenantgender;
    }

    public String getTenantphone() {
        return tenantphone;
    }

    public void setTenantphone(String tenantphone) {
        this.tenantphone = tenantphone;
    }
}
