package com.example.quiz2;

public class CarInfo {

    private String carName;
    private int urls;
    private String ownerName;
    private String phoneNumber;

    public CarInfo() {
    }

    public CarInfo(String carName, int urls, String ownerName, String phoneNumber) {
        this.carName = carName;
        this.urls = urls;
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getUrls() {
        return urls;
    }

    public void setUrls(int urls) {
        this.urls = urls;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
