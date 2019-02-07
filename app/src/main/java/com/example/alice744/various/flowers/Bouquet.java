package com.example.alice744.various.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Rose> rosesList = new ArrayList<Rose>();
    private List<Tulip> tulipsList = new ArrayList<Tulip>();
    private List<Carnation> carnationsList = new ArrayList<Carnation>();

    public void addFlower(Rose rose) {
        this.rosesList.add(rose);
    }

    public void addFlower(Tulip tulip) {
        this.tulipsList.add(tulip);
    }

    public void addFlower(Carnation carnation) {
        this.carnationsList.add(carnation);
    }

    public int getQuantity() {
        return rosesList.size() + tulipsList.size() + carnationsList.size();
    }

    public void addManyRose(int price, int quantity) {
        for (int i = 0; i < quantity; i++) {
            rosesList.add(new Rose(price));
        }
    }

    public void addManyTulip(int price, int quantity) {
        for (int i = 0; i < quantity; i++) {
            tulipsList.add(new Tulip(price));
        }
    }

    public void addManyCarnation(int price, int quantity) {
        for (int i = 0; i < quantity; i++) {
            carnationsList.add(new Carnation(price));
        }
    }

    public int getBouquetPrice() {
        int bouquetPrice = 0;
        for (int i = 0; i < rosesList.size(); i++) {
            Rose roseItem = rosesList.get(i);
            bouquetPrice += roseItem.getPrice();
        }
        for (int i = 0; i < tulipsList.size(); i++) {
            Tulip tulipItem = tulipsList.get(i);
            bouquetPrice += tulipItem.getPrice();
        }
        for (int i = 0; i < carnationsList.size(); i++) {
            Carnation carnationItem = carnationsList.get(i);
            bouquetPrice += carnationItem.getPrice();
        }
        return bouquetPrice;
    }
}
