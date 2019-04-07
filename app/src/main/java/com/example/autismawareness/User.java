package com.example.autismawareness;

import java.util.ArrayList;

public class User {
    private String name;
    private String username;
    private String password;
    // Emergency
    private String num_parent;
    private String name_parent;
    private String name_doctor;
    private String num_doctor;
    // Daily Routine
    private String wake_time;
    private String breakfast_time;
    private String lunch_time;
    private String dinner_time;
    private String sleep_time;
    // Health
    private String blood_type;
    private String weight;
    private String height;
    // Food
    private String allergies;
    private String meal_plan;
    private String favorite_food;
    private String bad_food;


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

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNum_parent() {
        return num_parent;
    }

    public void setNum_parent(String num_parent) {
        this.num_parent = num_parent;
    }

    public String getName_parent() {
        return name_parent;
    }

    public void setName_parent(String name_parent) {
        this.name_parent = name_parent;
    }

    public String getName_doctor() {
        return name_doctor;
    }

    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }

    public String getNum_doctor() {
        return num_doctor;
    }

    public void setNum_doctor(String num_doctor) {
        this.num_doctor = num_doctor;
    }

    public String getWake_time() {
        return wake_time;
    }

    public void setWake_time(String wake_time) {
        this.wake_time = wake_time;
    }

    public String getBreakfast_time() {
        return breakfast_time;
    }

    public void setBreakfast_time(String breakfast_time) {
        this.breakfast_time = breakfast_time;
    }

    public String getLunch_time() {
        return lunch_time;
    }

    public void setLunch_time(String lunch_time) {
        this.lunch_time = lunch_time;
    }

    public String getDinner_time() {
        return dinner_time;
    }

    public void setDinner_time(String dinner_time) {
        this.dinner_time = dinner_time;
    }

    public String getSleep_time() {
        return sleep_time;
    }

    public void setSleep_time(String sleep_time) {
        this.sleep_time = sleep_time;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMeal_plan() {
        return meal_plan;
    }

    public void setMeal_plan(String meal_plan) {
        this.meal_plan = meal_plan;
    }

    public String getFavorite_food() {
        return favorite_food;
    }

    public void setFavorite_food(String favorite_food) {
        this.favorite_food = favorite_food;
    }

    public String getBad_food() {
        return bad_food;
    }

    public void setBad_food(String bad_food) {
        this.bad_food = bad_food;
    }
}
