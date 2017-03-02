package com.serega.practice.module05.task054;

import com.serega.practice.module05.task053.API;
import com.serega.practice.module05.task05_1_2.Room;

import java.util.Date;

public class BookingAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingAPI() {
        rooms[0] = new Room(1, 9000, 3, new Date(), "HAYAT", "Киев");
        rooms[1] = new Room(2, 8000, 2, new Date(), "HAYAT", "Киев");
        rooms[2] = new Room(3, 8500, 2, new Date(), "HAYAT", "Киев");
        rooms[3] = new Room(4, 7000, 2, new Date(), "HAYAT", "Киев");
        rooms[4] = new Room(5, 8000, 2, new Date(), "HAYAT", "Киев");
    }

    public Room[] getRooms() {
        return rooms;
    }

    public Room[] findRoom(int price, int persons, String city, String hotel) {
        Room[] newarray = new Room[0];
        Room templateroom = new Room(00, price, persons, new Date(), hotel, city);


        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].equals(templateroom) && rooms[i].getHotelName().equals(hotel)) {
                newarray = Room.newRoomsArray(newarray, rooms[i]);
            }
        }

        return newarray;

    }

}
