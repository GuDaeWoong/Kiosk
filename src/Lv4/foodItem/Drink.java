package Lv4.foodItem;
import Lv4.Food.Food;

public class Drink implements Food {
    String drinkName;
    double drinkPrice;
    String drinkDes;

    //생
    public Drink(String drinkName, double drinkPrice, String drinkDes) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkDes = drinkDes;
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
    public void output(int i) {
        System.out.println(i+ ". "+drinkName +"   | W "+ drinkPrice+" | " + drinkDes);
    }
}
