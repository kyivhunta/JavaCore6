package com.serega.practice.module05.task055;

import com.serega.practice.module05.task05_1_2.Room;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}
