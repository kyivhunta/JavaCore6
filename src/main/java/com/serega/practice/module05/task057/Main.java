package com.serega.practice.module05.task057;

import com.serega.practice.module05.task054.BookingAPI;
import com.serega.practice.module05.task054.GoogleAPI;
import com.serega.practice.module05.task054.TripAdvisorAPI;
import com.serega.practice.module05.task055.DAOrealization;
import com.serega.practice.module05.task056.Controller;
import com.serega.practice.module05.task05_1_2.Room;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println(Arrays.toString(controller.requstRooms(3000, 3, "Киев", "Ukraina")));
        System.out.println(Arrays.toString(controller.requstRooms(7500, 2, "Киев", "Dnipro")));
        System.out.println(Arrays.toString(controller.requstRooms(8000, 2, "Киев", "PremierPalatz")));

        System.out.println(Arrays.toString(controller.check(new TripAdvisorAPI(), new GoogleAPI())));
        System.out.println(Arrays.toString(controller.check(new GoogleAPI(), new TripAdvisorAPI())));

        DAOrealization daoRealization = new DAOrealization();
        daoRealization.findById(111);
        daoRealization.save(new Room(222, 5000, 4, new Date(), "Kreshatyk", "Kyiv"));
        daoRealization.delete(new Room(333, 5000, 4, new Date(), "Kreshatyk", "Kyiv"));
        daoRealization.update(new Room(444, 5000, 4, new Date(), "Kreshatyk", "Kyiv"));


    }
}
