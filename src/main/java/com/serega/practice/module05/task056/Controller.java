package com.serega.practice.module05.task056;

import com.serega.practice.module05.task053.API;
import com.serega.practice.module05.task054.BookingAPI;
import com.serega.practice.module05.task054.GoogleAPI;
import com.serega.practice.module05.task054.TripAdvisorAPI;
import com.serega.practice.module05.task05_1_2.Room;


public class Controller {

    private API[] apis = new API[3];

    {

        apis[0] = new BookingAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();

    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[0];

        for (int i = 0; i < apis.length; i++) {

            result = joinArray(result, apis[i].findRoom(price, persons, city, hotel));

        }

        return result;
    }


    public Room[] check(API api1, API api2) {

        Room[] resultarray = new Room[0];

        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    //метод newRoomsArray я переместил в класс Room и сделал статик, потому что он нужен в каждом классе АПИ и здесь
                    resultarray = Room.newRoomsArray(resultarray, api1.getRooms()[i]);
                    resultarray = Room.newRoomsArray(resultarray, api2.getRooms()[j]);
                }
            }
        }

        return resultarray;
    }

    public Room[] joinArray(Room[] srcarray, Room[] addarray) {

        Room[] arr = new Room[srcarray.length + addarray.length];
        System.arraycopy(srcarray, 0, arr, 0, srcarray.length);
        System.arraycopy(addarray, 0, arr, srcarray.length, addarray.length);
        return arr;
    }

}
