package com.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {

        //Create an array of integers
        double[] numbers = {11.0, 2.0, 3.0, 4.0, 5.0};
        var sum = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        var oldAvg = sum / numbers.length;
        System.out.println("Average: " + oldAvg);


        var newAvg = ((5 * oldAvg) + 6) / 6;
        System.out.println("New average is : " + newAvg);
    }
}
