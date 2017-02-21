package com.serega.practice.module04.task046;

import com.serega.practice.module04.task042.Currency;
import com.serega.practice.module04.task043.ChinaBank;
import com.serega.practice.module04.task043.EUBank;
import com.serega.practice.module04.task043.USBank;
import com.serega.practice.module04.task044.User;
import com.serega.practice.module04.task045.BankSystemImpl;


public class Main {
    public static void main(String[] args) {

        ChinaBank eastBank = new ChinaBank(12, "China", Currency.USD, 250, 1000, 5, 1000000000L);
        ChinaBank beijingBank = new ChinaBank(11, "China", Currency.USD, 400, 1500, 3, 1000000000L);

        EUBank centralEuropBank = new EUBank(16, "Germany",Currency.USD,400,2500,7,5000000000000L);
        EUBank swdBank = new EUBank(17, "Swizerland",Currency.EURO,600,3000,10,50000000000000L);

        USBank IMF = new USBank(19, "Washington",Currency.USD,1000,3200,10,50000000000000L);
        USBank BankOfAmerica = new USBank(18, "NewYork",Currency.USD,1000,3200,10,50000000000000L);


        User user1 = new User(1795464366L, "Афоний", 0.0, 12, "Google", 2500, eastBank);
        User user2 = new User(5479846463L, "Николай", 0.0, 7, "Microsoft", 5000, beijingBank );
        User user3 = new User(5479821454L, "Вася", 0.0, 3, "Oracle", 5000, centralEuropBank );
        User user4 = new User(4322846462L, "Инокентий", 0.0, 5, "Apple", 4500, swdBank );
        User user5 = new User(6123565441L, "Акакий", 0.0, 8, "YouTube", 5500, IMF );
        User user6 = new User(5412354363L, "Зураб", 0.0, 2, "Yahoo", 4400, BankOfAmerica );

        BankSystemImpl worldPrivat = new BankSystemImpl();
        worldPrivat.paySalary(user1);
        worldPrivat.paySalary(user2);
        worldPrivat.paySalary(user3);
        worldPrivat.paySalary(user4);
        worldPrivat.paySalary(user5);
        worldPrivat.paySalary(user6);

        worldPrivat.withdrawOfUser(user1,100);
        worldPrivat.withdrawOfUser(user2,150);
        worldPrivat.withdrawOfUser(user3,2000);
        worldPrivat.withdrawOfUser(user4,1500);
        worldPrivat.withdrawOfUser(user5,1000);
        worldPrivat.withdrawOfUser(user6,1400);

        worldPrivat.fundUser(user1,1000);
        worldPrivat.fundUser(user2,1000);
        worldPrivat.fundUser(user3,1000);
        worldPrivat.fundUser(user4,1000);
        worldPrivat.fundUser(user5,1000);
        worldPrivat.fundUser(user6,1000);

        worldPrivat.transferMoney(user1,user2,500);
        worldPrivat.transferMoney(user3,user4,1000);
        worldPrivat.transferMoney(user5,user6,1200);

        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());



    }
}
