package com.example.yotechpractice.retrofitapicall;

public class userModel {
    String device_id;
    String device_ip;
    String device_type;
    int rid;


    public userModel(String device_id, String device_ip, String device_type, int rid) {
        this.device_id = device_id;
        this.device_ip = device_ip;
        this.device_type = device_type;
        this.rid = rid;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getDevice_ip() {
        return device_ip;
    }

    public void setDevice_ip(String device_ip) {
        this.device_ip = device_ip;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }


}
