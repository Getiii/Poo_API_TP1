package com.maven.tp5.model;

public class AddressCourt {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    AddressCourt(String address){
        setAddress(address);
    }
}
