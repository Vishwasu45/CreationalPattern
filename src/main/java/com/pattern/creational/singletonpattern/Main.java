package com.pattern.creational.singletonpattern;

public class Main {

    public static void main(String[] args) {
        var instance = SingletonInstance.getInstance();
        var secondInstance = SingletonInstance.getInstance();

        assert instance == secondInstance;
    }
}
