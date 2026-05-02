package com.pattern.creational.builder;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        var builder = BuilderInstance.builder()
                .name("John")
                .surname("Doe")
                .age(25)
                .address("1234 Main St")
                .build();
        System.out.println(Objects.equals(builder.getName(), "John"));
    }
}
