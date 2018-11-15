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
    public void addRose(int quantity){
        for (int i=0;i<500;i++){
            rose.add(new Rose(50));
        }
    }
    public void addTulip(int quantity){
        for(int i=0;i<7;i++) {
            tulip.add(new Tulip(70));
        }
    }
    public void addCarnation(int quantity){
        for(int i=0;i<156;i++) {
            carnation.add(new Carnation(30));
        }
    }
    public String getQuantity(){
        return "rose: "+rose.size()+", tulip: "+tulip.size()+", carnation: "+carnation.size();
    }
    public int getPriceBouquet(){
             return rose.size()+tulip.size()+carnation.size();
    }
}
//стоимость