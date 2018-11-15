package com.example.alice744.various;

import com.example.alice744.various.flowers.Bouquet;
import com.example.alice744.various.flowers.Carnation;
import com.example.alice744.various.flowers.Flower;
import com.example.alice744.various.flowers.Rose;
import com.example.alice744.various.flowers.Tulip;

import java.util.ArrayList;

public class MainActivity  {
    public static void main(String[] args){
        ArrayList<Flower> flowers=new ArrayList<Flower>();

        Rose rose=new Rose(50);
        Tulip tulip=new Tulip(70);
        Carnation carnation=new Carnation(30);

        Bouquet bouquet=new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        bouquet.addFlower(carnation);
        bouquet.getQuantity();
        System.out.println(bouquet.getPriceBouquet());

        flowers.add(rose);
        flowers.add(tulip);
        flowers.add(carnation);
    }
}
