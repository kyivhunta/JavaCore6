package com.serega.practice.module02.task024;


public class Funding {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Funding obj = new Funding();
        obj.fundingBalance(ownerNames, balances, "Ann", 3000);

    }

    public void fundingBalance(String[] ownerNames, int[] balances, String nameOwner, int withrawal) {

        double funding;
        int i;
        for (i = 0; i < ownerNames.length - 1; i++) {
            if (ownerNames[i].equals(nameOwner))
                break;
        }
        if (ownerNames[i].equals(nameOwner)) {
            funding = balances[i] + withrawal;
            System.out.println(nameOwner + " " + funding);
        } else System.out.println("Такого имени нет!!!");

    }

}
