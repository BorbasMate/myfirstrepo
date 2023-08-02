package com.example.demojavafx;

public class Parrot {

    String name;
    int age;
    boolean hasFriends;
    public static final int MAX_SPEED = 36;

    public Parrot(String name, int age, boolean hasFriends) {
        this.name = name;
        this.age = age;
        this.hasFriends = hasFriends;

    }

    public void speak() {
        System.out.println(name + " okos madár");
    }

}
