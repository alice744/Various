package com.example.alice744.various.car;

public class Car {
    public String model;
    public int carWeight;
    public int power;

    public Car(String model,int carWeight,int power){
        this.model=model;
        this.carWeight=carWeight;
        this.power=power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
