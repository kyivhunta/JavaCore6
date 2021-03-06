package com.serega.practice.module05.task05_1_2;

import java.util.Arrays;
import java.util.Date;

public class Room {
    private long id;
    private int price;///
    private int persons;///
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;///

    @Override
    public String toString() {
        return " Комната id: " + id +
                " || Цена: " + price + " грн." +
                " || На " + persons + " персоны " +
                " || Свободна с: " + dateAvailableFrom +
                " || Отель: " + hotelName +
                " || Город: " + cityName +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        return cityName.equals(room.cityName);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + cityName.hashCode();
        return result;
    }

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public static Room[] newRoomsArray(Room[] rooms, Room room) {

        Room[] copyroom = Arrays.copyOf(rooms, rooms.length + 1);
        copyroom[copyroom.length - 1] = room;
        return copyroom;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


}
