package com.example.alice744.various;

import com.example.alice744.various.flowers.Bouquet;


public class MainActivity {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addManyCarnation(40, 20);
        System.out.println(bouquet.getBouquetPrice());
        System.out.println(bouquet.getBouquetPrice());
        System.out.println(bouquet.getBouquetPrice());
    }
}