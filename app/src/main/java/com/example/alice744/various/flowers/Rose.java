package com.example.alice744.various.flowers;

public class Rose extends Flower {
    public Rose() {
    }

    public Rose(int price) {
        this.price = price;
        this.color = "red";
    }

    public Rose(int price, int height) {
        this.price = price;
        this.height = height;
        this.color = "red";
    }

    public Rose(int price, int height, String color) {
        this.price = price;
        this.height = height;
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return this.price;
    }
}
