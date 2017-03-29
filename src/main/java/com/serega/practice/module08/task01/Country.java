package com.serega.practice.module08.task01;

public enum Country {

    UKRAINE(1), USA(2), CHINA(3), ITALY(3), POLAND(4), GEORGIA(5), TURKEY(6);

    int countryNumber;
    Country(int i) {
        this.countryNumber = i;
    }

    public int getCountryNumber() {
        return countryNumber;
    }
}
