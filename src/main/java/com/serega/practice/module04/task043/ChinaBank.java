package com.serega.practice.module04.task043;

import com.serega.practice.module04.task041.Bank;
import com.serega.practice.module04.task042.Currency;

public class ChinaBank extends Bank {

    public final static int THREEPERSENT = 3;
    public final static int FIVEPERSENT = 5;
    public final static int TENPERSENT = 10;
    public final static int ELEVENPERSENT = 11;
    public final static int ONEPERSENT = 1;
    public final static int ZEROPERSENT = 0;




    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int limit = 0;
        switch (getCurrency()) {
            case EURO:
                limit = 150;
                break;
            case USD:
                limit = 1000000000;
                break;
        }
        return limit;
    }

    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case USD:
                limit = 5000;
                break;
            case EURO:
                limit = 10000;
                break;

        }
        return limit;
    }

    public int getMonthlyRate() {
        if (getCurrency().equals(Currency.USD)) return ONEPERSENT;
        else return ZEROPERSENT;
    }

    public int getCommission(int summ) {
        int persent = 0;
        if (getCurrency().equals(Currency.USD) && summ < 1000) persent = THREEPERSENT;
        else if (getCurrency().equals(Currency.USD) && summ > 1000) persent = FIVEPERSENT;
        if (getCurrency().equals(Currency.EURO) && summ < 1000) persent = TENPERSENT;
        else if (getCurrency().equals(Currency.EURO) && summ > 1000) persent = ELEVENPERSENT;
        return persent;

    }

}
