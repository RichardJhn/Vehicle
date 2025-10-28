package com.pluralsight;

public class Vehicle {
    protected String engine;
    protected String gas;
    protected String operator;
    protected String speed;
    protected String vin;


    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngine() {
        return engine;
    }

    public String getGas() {
        return gas;
    }

    public String getOperator() {
        return operator;
    }

    public String getSpeed() {
        return speed;
    }

    public String getVin() {
        return vin;
    }

    public Vehicle(String engine, String gas, String operator, String speed, String vin) {
        this.engine = engine;
        this.gas = gas;
        this.operator = operator;
        this.speed = speed;
        this.vin = vin;
    }

}
