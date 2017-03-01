package com.serega.practice.module05.task054;

import com.serega.practice.module05.task053.API;
import com.serega.practice.module05.task05_1_2.Room;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];


    public GoogleAPI() {

        rooms[0] = new Room(6, 8000, 2, new Date(), "PremierPalatz", "Киев");
        rooms[1] = new Room(7, 8500, 3, new Date(), "PremierPalatz", "Киев");
        rooms[2] = new Room(8, 7000, 2, new Date(), "Ukaraina", "Киев");
        rooms[3] = new Room(9, 3000, 3, new Date(), "Ukraina", "Киев");
        rooms[4] = new Room(10, 3000, 4, new Date(), "Ibis", "Киев");


    }

    public Room[] getRooms() {
        return rooms;
    }

    public Room[] findRoom(int price, int persons, String city, String hotel) {
        Room[] newarray = new Room[0];

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                newarray = Room.newRoomsArray(newarray, rooms[i]);
            }
        }

        return newarray;

    }

}


