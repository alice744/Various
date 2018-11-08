package com.example.alice744.various.car;

public class Lorry extends Car {
    private int capacity;

    public Lorry(){

    }
    public Lorry(String model,int carWeight,int power, int capacity){
        super(model,carWeight,power);
        this.capacity=capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setModel(String model){
        super.model=model;

    }
}
