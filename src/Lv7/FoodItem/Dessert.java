package Lv7.FoodItem;

import Lv7.Food.Food;

public class Dessert implements Food {
    int dessertNumber;
    String dessertName;
    double dessertPrice;
    String dessertDes;

    //생
    public Dessert(int dessertNumber, String dessertName, double dessertPrice, String dessertDes) {
        this.dessertNumber = dessertNumber;
        this.dessertName = dessertName;
        this.dessertPrice = dessertPrice;
        this.dessertDes = dessertDes;
    }

    @Override
    public int getNumber() {
        return dessertNumber;
    }

    @Override
    public String getName() {
        return dessertName;
    }

    @Override
    public double getPrice() {
        return dessertPrice;
    }

    @Override
    public String getDes() {
        return dessertDes;
    }

    @Override
    public void output() {
        System.out.println(dessertNumber + ". "+dessertName +"   | W "+ dessertPrice+" | " + dessertDes);

    }


}