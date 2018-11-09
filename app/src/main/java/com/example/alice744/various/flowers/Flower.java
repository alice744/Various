package com.example.alice744.various.flowers;
import com.example.alice744.various.flowers.Flower;
public class Flower extends Bouquet{
    protected int price;
    protected int quantity;

    public Flower(int price,int quantity){
        this.price=price;
        this.quantity=quantity;
    }
}