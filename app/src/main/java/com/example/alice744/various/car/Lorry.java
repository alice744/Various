package com.example.alice744.various.car;

public class Lorry extends Car {
    public int capacity;

    public Lorry(String model,int carWeight,int power){
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
