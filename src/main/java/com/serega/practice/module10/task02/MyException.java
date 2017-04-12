package com.serega.practice.module10.task02;

public class MyException extends Exception {

   private String reference;

    public MyException(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }
}
