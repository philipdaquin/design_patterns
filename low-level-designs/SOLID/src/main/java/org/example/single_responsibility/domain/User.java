package org.example.single_responsibility.domain;

public class User {
    String username;
    String password;
    int age;

    public User(String username, String password, int age) {
        this.username = username;
        this.password =password;
        this.age = age;
    }
}

