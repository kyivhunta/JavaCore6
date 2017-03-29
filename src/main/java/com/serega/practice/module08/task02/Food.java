package com.serega.practice.module08.task02;

import com.serega.practice.module08.task01.Country;
import com.serega.practice.module08.task01.IdGenerator;

public class Food {
    private final int id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        this.name = name;
        this.country = country;
        this.expiration = expiration;
        id = IdGenerator.idGenerator(name,country,expiration);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return id == food.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getExpiration() {
        return expiration;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name = '" + name + '\'' +
                ", country = " + country +
                ", expiration = " + expiration +
                '}' + "\n";
    }
}
