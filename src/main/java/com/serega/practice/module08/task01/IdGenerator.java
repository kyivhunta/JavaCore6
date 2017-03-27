package com.serega.practice.module08.task01;


public final class IdGenerator {

    private static int productid = 1;

    public static int idGenerator() {

        return productid++;

    }

}
