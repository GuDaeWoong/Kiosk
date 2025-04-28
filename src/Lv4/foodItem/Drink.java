package Lv4.foodItem;
import Lv4.Food.Food;

public class Drink implements Food {
    int drinkNumber;
    String drinkName;
    double drinkPrice;
    String drinkDes;

    //생
    public Drink(int drinkNumber, String drinkName, double drinkPrice, String drinkDes) {
        this.drinkNumber = drinkNumber;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkDes = drinkDes;
    }

    @Override
    public int getNumber() {
        return drinkNumber;
    }

    @Override
    public String getName() {
        return drinkName;
    }

    @Override
    public double getPrice() {
        return drinkPrice;
    }

    @Override
    public String getDes() {
        return drinkDes;
    }

    // 메서드
    @Override
    public void output() {
        System.out.println(drinkNumber+ ". "+drinkName +"   | W "+ drinkPrice+" | " + drinkDes);
    }
}
