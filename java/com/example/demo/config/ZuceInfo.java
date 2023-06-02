package com.example.demo.config;

public class ZuceInfo {
    private String tenantid;
    private String username;
    private String password;
    private String type;

    private String tenantname;

    @Override
    public String toString() {
        return "ZuceInfo{" +
                "tenantid='" + tenantid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", tenantname='" + tenantname + '\'' +
                ", tenantgender='" + tenantgender + '\'' +
                ", tenantphone='" + tenantphone + '\'' +
                '}';
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    private String tenantgender;

    private String tenantphone;
}
