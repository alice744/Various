package com.example.alice744.various.flowers;

public class Carnation extends Flower {
    public Carnation(int price){
        this.price=price;
        this.color="black";
    }
    public Carnation(int price,int height){
        this.price=price;
        this.height=height;
        this.color="black";
    }
    public Carnation(int price,int height,String color){
        this.price=price;
        this.height=height;
        this.color=color;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getPrice() {
        return this.price;
    }
}
