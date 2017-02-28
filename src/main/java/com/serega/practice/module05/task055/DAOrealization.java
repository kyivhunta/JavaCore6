package com.serega.practice.module05.task055;

import com.serega.practice.module05.task05_1_2.Room;

public class DAOrealization implements DAO {

    Room[] rooms = new Room[10];


    public void save(Room room) {
        System.out.println("Конмната c id:" + room.getId() + " сохранена!");
    }

    public void delete(Room room) {
        System.out.println("Комната c id:" + room.getId() + " удалена!");
    }

    public void update(Room room) {
        System.out.println("Комната с id:" + room.getId() + " udated!");
    }

    public void findById(long id) {
        System.out.println("Комната с id:" + id + " найдена!");
    }
}
