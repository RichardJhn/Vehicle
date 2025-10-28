package com.pluralsight;

public class Car extends Vehicle {
    private String typeOfCar;

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }


    public Car(String typeOfCar,String engine, String gas, String operator, String speed, String vin){
        super(engine, gas, operator, speed, vin);
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfCar='" + typeOfCar + '\'' +
                ", engine='" + engine + '\'' +
                ", gas='" + gas + '\'' +
                ", operator='" + operator + '\'' +
                ", speed='" + speed + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
