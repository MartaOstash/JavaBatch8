package com.syntax.class21;

public class UserClass {
    String name;
    private String mobileNumber;

    UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}