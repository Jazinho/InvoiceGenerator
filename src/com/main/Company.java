package com.main;

import javax.swing.*;

/**
 * Created by Jaśko on 2016-11-03.
 */

public class Company {
    private String name;
    private String owner;
    private String NIP;
    private String address;
    private String postalCode;
    private String city;
    private String phone;

    public Company(){
        this.name = "Transkomat";
        this.owner = "Stanisław Pałucki";
        this.NIP = "869-000-10-03";
        this.address = "Porąbka Uszewska 366";
        this.postalCode = "32-854";
        this.city = "Porąbka Uszewska";
        this.phone = "601-805-351";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
