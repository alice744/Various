package com.example.alice744.various.car;

public class Lorry extends Car {
    public int capacity;

    public Lorry(){
    }
    public Lorry(int power){
        this.power=power;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setModel(String model){
        super.model=model;

    }
}
