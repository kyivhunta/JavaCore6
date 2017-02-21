package com.serega.practice.module04.task043;

import com.serega.practice.module04.task041.Bank;
import com.serega.practice.module04.task042.Currency;

public class EUBank extends Bank {

    public static final int FIVEPERSENT = 5;
    public final static int SEVENPERSENT = 7;
    public final static int TWOPERSENT = 2;
    public final static int FOURPERSENT = 4;
    public final static int ONEPERSENT = 1;
    public final static int ZEROPERSENT = 0;


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        int limit = 0;
        switch (getCurrency()) {
            case EURO:
                limit = 2200;
                break;
            case USD:
                limit = 2000;
                break;
        }
        return limit;
    }

    public int getLimitOfFunding() {
        int limit = 0;
        switch (getCurrency()) {
            case USD:
                limit = 10000;
                break;
            case EURO:
                limit = 20000;
                break;

        }
        return limit;
    }

    public int getMonthlyRate() {
        if (getCurrency().equals(Currency.EURO)) return ONEPERSENT;
        else return ZEROPERSENT;
    }

    public int getCommission(int summ) {
        int persent = 0;
        if (getCurrency().equals(Currency.USD) && summ < 1000) persent = FIVEPERSENT;
        else if (getCurrency().equals(Currency.USD) && summ > 1000) persent = SEVENPERSENT;
        if (getCurrency().equals(Currency.EURO) && summ < 1000) persent = TWOPERSENT;
        else if (getCurrency().equals(Currency.EURO) && summ > 1000) persent = FOURPERSENT;
        return persent;

    }

}
