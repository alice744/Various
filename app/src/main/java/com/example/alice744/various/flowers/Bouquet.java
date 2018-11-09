package com.example.alice744.various.flowers;

public class Bouquet {
    public static void main(String[] args){
        Rose rose=new Rose(50,4);
        Tulip tulip=new Tulip(70,3);
        Carnation carnation=new Carnation(30,6);
        System.out.println(rose.getPrice()*rose.getQuantity()+tulip.getPrice()*tulip.getQuantity()+carnation.getPrice()*carnation.getQuantity());
    }
}
