package Lv4.foodItem;
import Lv4.Food.Food;

public class Burger implements Food {
    String burgerName;
    double burgerPrice;
    String burgerDes;


    //생
    public Burger(String burgerName, double burgerPrice, String burgerDes) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerDes = burgerDes;
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
    public void output(int i) {
        System.out.println(i+ ". "+burgerName +"   | W "+ burgerPrice+" | " + burgerDes);
    }


}
