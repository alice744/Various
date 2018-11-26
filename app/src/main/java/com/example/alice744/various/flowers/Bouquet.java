package com.example.alice744.various.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet extends Flower{

    private List<Flower> carnation=new ArrayList<Flower>();
    private List<Flower> rose=new ArrayList<Flower>();
    private List<Flower> tulip=new ArrayList<Flower>();
    Rose rose1=new Rose(50);
    Tulip tulip1=new Tulip(70);
    Carnation carnation1=new Carnation(30);
    public void addFlower(Rose rose){
        this.rose.add(rose);
    }
    public void addFlower(Tulip tulip){
        this.tulip.add(tulip);
    }
    public void addFlower(Carnation carnation){
        this.carnation.add(carnation);
    }
    public int addRose(int quantity){
        for (int i=0;i<quantity;i++){
            rose.add(new Rose(50));
        }
        return quantity;
    }
    public int addTulip(int quantity){
        for(int i=0;i<quantity;i++) {
            tulip.add(new Tulip(70));
        }
        return quantity;
    }
    public int addCarnation(int quantity){
        for(int i=0;i<quantity;i++) {
            carnation.add(new Carnation(30));
        }
        return quantity;
    }
    public String getQuantity(){
        return "rose: "+rose.size()+", tulip: "+tulip.size()+", carnation: "+carnation.size();
    }
    public int getPriceBouquet(){
             return addRose(4)*rose1.getPrice()+addTulip(2)*tulip1.getPrice()
                     +addCarnation(3)*carnation1.getPrice();
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
