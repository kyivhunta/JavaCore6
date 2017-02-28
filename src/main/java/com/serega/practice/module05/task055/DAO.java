package com.serega.practice.module05.task055;

import com.serega.practice.module05.task05_1_2.Room;

public interface DAO {

    void save(Room room);

    void delete(Room room);

    void update(Room room);

    void findById(long id);

}
