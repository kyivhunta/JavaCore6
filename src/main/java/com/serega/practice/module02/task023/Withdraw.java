package com.serega.practice.module02.task023;


public class Withdraw {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Withdraw obj = new Withdraw();
        obj.moneyOperation(ownerNames, balances, "Jane", 1000);

    }

    public void moneyOperation(String[] ownerNames, int[] balances, String nameOwner, double withdrawal) {

        double afterWithdrawal, persent, withpersent;
        int i;
        for (i = 0; i < ownerNames.length - 1; i++) {
            if (ownerNames[i].equals(nameOwner)) {
                break;
            }
        }
        if (nameOwner.equals(ownerNames[i])) {
            afterWithdrawal = balances[i] - withdrawal;
            persent = (withdrawal / 100) * 5;
            withpersent = afterWithdrawal - persent;
            System.out.println(withpersent < 0 ? ownerNames[i] + " NO" : ownerNames[i] + " " + withdrawal + " " + withpersent);
        } else System.out.println("Такого имени не найдено!!!");

    }
}
