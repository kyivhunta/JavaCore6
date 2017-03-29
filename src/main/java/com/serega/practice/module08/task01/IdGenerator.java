package com.serega.practice.module08.task01;


public final class IdGenerator {


    public static int idGenerator(String nameProduct, Country country, int expiration) {

        return Math.abs(country.getCountryNumber()+nameProduct.hashCode()+expiration);

    }

}
