package com.pluralsight;

public class Moped extends Vehicle{
    private String typeOfMoped;

    public String getTypeOfMoped() {
        return typeOfMoped;
    }

    public void setTypeOfMoped(String typeOfMoped) {
        this.typeOfMoped = typeOfMoped;
    }


    public Moped(String typeOfMoped){
        super(typeOfMoped, "15 Gallons","Hignacio","30MPH","32432532");
        this.typeOfMoped = typeOfMoped;

    }

}
