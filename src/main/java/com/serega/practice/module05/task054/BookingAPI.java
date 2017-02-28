package com.serega.practice.module05.task054;

import com.serega.practice.module05.task053.API;
import com.serega.practice.module05.task05_1_2.Room;

import java.util.Arrays;
import java.util.Date;

public class BookingAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingAPI() {
        rooms[0] = new Room(1, 9000, 3, new Date(), "HAYAT", "Киев");
        rooms[1] = new Room(2, 8000, 2, new Date(), "HAYAT", "Киев");
        rooms[2] = new Room(3, 8000, 2, new Date(), "HAYAT", "Киев");
        rooms[3] = new Room(4, 7000, 2, new Date(), "HAYAT", "Киев");
        rooms[4] = new Room(5, 8000, 2, new Date(), "HAYAT", "Киев");
    }

    public Room[] findRoom(int price, int persons, String city, String hotel) {
        Room[] newarray = new Room[0];

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                newarray = newRoomsArray(newarray, rooms[i]);
            }
        }

        return newarray;

    }

    public Room[] newRoomsArray(Room[] rooms, Room room) {

        Room[] copyroom = Arrays.copyOf(rooms, rooms.length + 1);
        copyroom[copyroom.length - 1] = room;
        return copyroom;

    }

    public Room[] getRooms() {
        return rooms;
    }


}
