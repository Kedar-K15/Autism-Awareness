package com.example.autismawareness;

import java.util.ArrayList;

public class User {
    private String name;
    private String username;
    private String password;
    private static ArrayList<User> users = new ArrayList<>();

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        users.add(this);
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static ArrayList<User> getInformation() {
        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }

    /*public static HashMap<String, String> getInformation() {
        return login_information;
    }*/
}
