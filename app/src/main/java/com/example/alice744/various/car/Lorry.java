package com.example.alice744.various.car;

public class Lorry extends Car {
    private int capacity;

    Lorry(int capacity, int carWeight, int power, String model){
        this.capacity=capacity;
        this.carWeight=carWeight;
        this.power=power;
        this.model=model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setModel(String model){
        super.model=model;

    }
}
