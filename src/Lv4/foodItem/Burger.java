package Lv4.foodItem;
import Lv4.Food.Food;

public class Burger implements Food {
    int burgerNumber;
    String burgerName;
    double burgerPrice;
    String burgerDes;


    //생
    public Burger(int burgerNumber, String burgerName, double burgerPrice, String burgerDes) {
        this.burgerNumber = burgerNumber;
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerDes = burgerDes;
    }

    @Override
    public int getNumber() {
        return burgerNumber;
    }

    @Override
    public String getName() {
        return burgerName;
    }

    @Override
    public double getPrice() {
        return burgerPrice;
    }

    @Override
    public String getDes() {
        return burgerDes;
    }

    @Override
    public void output() {
        System.out.println(burgerNumber+ ". "+burgerName +"   | W "+ burgerPrice+" | " + burgerDes);
    }


}
