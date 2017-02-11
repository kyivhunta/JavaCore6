package com.serega.practice.module03.task031;


public class Bird {

    private final static String TEXT = "I'm walking\nI'm flying\nI'm signing\nI'm Bird";
    private String name;


    public Bird(){
    }

    public Bird(String name){
        this.name = name;

    }

    public void sign(){
        if (this.name!=null) System.out.println("I'm "+this.name);
        System.out.println(TEXT);
        System.out.println();
    }

    public static void main(String[] args) {

        Bird birdwithoutname = new Bird();
        birdwithoutname.sign();


        Bird gosha = new Bird("Gosha");
        gosha.sign();

    }
}
