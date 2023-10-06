package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userServ = new UserServiceImpl();
        userServ.createUsersTable();
        userServ.saveUser("Alex", "Smith", (byte) 21);
        System.out.println("User с именем – Alex добавлен в базу данных");
        userServ.saveUser("Greda", "Smith", (byte) 19);
        System.out.println("User с именем – Greda добавлен в базу данных");
        userServ.saveUser("Tom", "Smith", (byte) 34);
        System.out.println("User с именем – Tom добавлен в базу данных");
        userServ.saveUser("Lora", "Smith", (byte) 27);
        System.out.println("User с именем – Lora добавлен в базу данных");
        System.out.println(userServ.getAllUsers());
        userServ.cleanUsersTable();
        userServ.dropUsersTable();
        Util.getClose();
    }
}
