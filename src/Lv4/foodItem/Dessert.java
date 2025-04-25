package Lv4.foodItem;
import Lv4.Food.Food;

public class Dessert implements Food {
    String dessertName;
    double dessertPrice;
    String dessertDes;

    //생
    public Dessert(String dessertName, double dessertPrice, String dessertDes) {
        this.dessertName = dessertName;
        this.dessertPrice = dessertPrice;
        this.dessertDes = dessertDes;
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
    public void output(int i) {
        System.out.println(i+ ". "+dessertName +"   | W "+ dessertPrice+" | " + dessertDes);

    }

    // 메서드
    public void outputDessertMenu(int num) {
        System.out.println(num + ". " + dessertName + "   | W " + dessertPrice + " | " + dessertDes);
    }
}
