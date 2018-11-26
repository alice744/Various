package com.example.alice744.various.flowers;

public class Tulip extends Flower {
    public Tulip(int price){
        this.price=price;
        this.color="pink";
    }
    public Tulip(int price,int height){
        this.price=price;
        this.height=height;
        this.color="pink";
    }
    public Tulip(int price,int height,String color){
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
