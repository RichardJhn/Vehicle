package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car("V8", "10 Gallons", "John", "200mph", "1924875", "Scat-pack");

        System.out.println("This is the information of your car: " + c);
    }

}
