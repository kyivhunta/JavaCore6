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

        BookingAPI bookingAPI = new BookingAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        Room[] resultarray1 = new Room[0];
        Room[] resultarray2 = new Room[0];

        if (api1.getClass() == bookingAPI.getClass() && api2.getClass() == googleAPI.getClass() || api1.getClass() == googleAPI.getClass() && api2.getClass() == bookingAPI.getClass()) {
            for (int i = 0; i < bookingAPI.getRooms().length; i++) {
                for (int j = 0; j < googleAPI.getRooms().length; j++) {
                    if (bookingAPI.getRooms()[i].equals(googleAPI.getRooms()[j])) {
                        resultarray1 = bookingAPI.newRoomsArray(resultarray1, bookingAPI.getRooms()[i]);
                        resultarray2 = googleAPI.newRoomsArray(resultarray2, googleAPI.getRooms()[j]);
                    }
                }
            }
        }

        if (api1.getClass() == bookingAPI.getClass() && api2.getClass() == tripAdvisorAPI.getClass() || api1.getClass() == tripAdvisorAPI.getClass() && api2.getClass() == bookingAPI.getClass()) {
            for (int i = 0; i < bookingAPI.getRooms().length; i++) {
                for (int j = 0; j < googleAPI.getRooms().length; j++) {
                    if (bookingAPI.getRooms()[i].equals(googleAPI.getRooms()[j])) {
                        resultarray1 = bookingAPI.newRoomsArray(resultarray1, bookingAPI.getRooms()[i]);
                        resultarray2 = tripAdvisorAPI.newRoomsArray(resultarray2, tripAdvisorAPI.getRooms()[j]);
                    }
                }
            }
        }

        if (api1.getClass() == googleAPI.getClass() && api2.getClass() == tripAdvisorAPI.getClass() || api1.getClass() == tripAdvisorAPI.getClass() && api2.getClass() == googleAPI.getClass()) {
            for (int i = 0; i < googleAPI.getRooms().length; i++) {
                for (int j = 0; j < tripAdvisorAPI.getRooms().length; j++) {
                    if (googleAPI.getRooms()[i].equals(tripAdvisorAPI.getRooms()[j])) {
                        resultarray1 = googleAPI.newRoomsArray(resultarray1, googleAPI.getRooms()[i]);
                        resultarray2 = tripAdvisorAPI.newRoomsArray(resultarray2, tripAdvisorAPI.getRooms()[j]);
                    }
                }
            }
        }
        return joinArray(resultarray1, resultarray2);
    }

    public Room[] joinArray(Room[] srcarray, Room[] addarray) {

        Room[] arr = new Room[srcarray.length + addarray.length];
        System.arraycopy(srcarray, 0, arr, 0, srcarray.length);
        System.arraycopy(addarray, 0, arr, srcarray.length, addarray.length);
        return arr;
    }

}
