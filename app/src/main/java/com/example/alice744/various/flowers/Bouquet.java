package com.example.alice744.various.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet extends Flower{

    private List<Flower> carnation=new ArrayList<Flower>();
    private List<Flower> rose=new ArrayList<Flower>();
    private List<Flower> tulip=new ArrayList<Flower>();
    public void addFlower(Rose rose){
        this.rose.add(rose);
    }
    public void addFlower(Tulip tulip){
        this.tulip.add(tulip);
    }
    public void addFlower(Carnation carnation){
        this.carnation.add(carnation);
    }
    public String getQuantity(){
        return "rose: "+rose.size()+", tulip: "+tulip.size()+", carnation: "+carnation.size();
    }
    public int addManyRose(int price,int quantity){
        for (int i=0;i<quantity;i++){
            rose.add(new Rose(price));
        }
        return price*quantity;
    }
    public int addManyTulip(int price,int quantity){
        for (int i=0;i<quantity;i++){
            tulip.add(new Tulip(price));
        }
        return price*quantity;
    }
    public int addManyCarnation(int price,int quantity){
        for (int i=0;i<quantity;i++){
            carnation.add(new Tulip(price));
        }
        return price*quantity;
    }
    public int getPriceManyFlowersInBouquet(){
        return addManyRose(50, 800)+addManyTulip(30,50)+
                addManyCarnation(70,5);
    }
}
