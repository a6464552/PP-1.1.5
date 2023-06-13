package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alex", "T", (byte) 38);
        userService.saveUser("Ksu", "L", (byte) 37);
        userService.saveUser("Al", "G", (byte) 25);
        userService.saveUser("Xo", "S", (byte) 28);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();





    }

}
