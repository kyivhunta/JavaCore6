package com.serega.practice.module05.task053;

import com.serega.practice.module05.task05_1_2.Room;

public interface API {

    Room[] findRoom(int price, int persons, String city, String hotel);

    Room[] getRooms();

}
