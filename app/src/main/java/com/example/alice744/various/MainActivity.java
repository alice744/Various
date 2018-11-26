package com.example.alice744.various;

import com.example.alice744.various.flowers.Bouquet;
import com.example.alice744.various.flowers.Flower;
import java.util.ArrayList;

public class MainActivity  {
    public static void main(String[] args){
        ArrayList<Flower> flowers=new ArrayList<Flower>();
        Bouquet bouquet=new Bouquet();
        System.out.println(bouquet.getPriceBouquet());
        System.out.println(bouquet.getPriceManyFlowersInBouquet());
    }
}
