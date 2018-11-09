package com.example.alice744.various.flowers;

public class Carnation extends Flower {
    public Carnation (int price,int quantity){
        super(price,quantity);
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
}
