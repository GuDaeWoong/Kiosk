package Lv7;

import java.util.function.Function;

public enum Discount{
    VETERAN(1, price -> price * (1 - 0.1)),
    ARMY(2, price -> price * (1 - 0.05)),
    STUDENT(3, (price)-> price * 0.97),
    DEFAULT(0,  price -> price);

    private final  int num;
    private final Function<Double, Double> function;

    Discount(int num, Function<Double, Double> function) {
        this.num = num;
        this.function = function;
    }

    public int getDiscountNum() {
        return num;
    }

    //enum에 있는 람다식 적용 메서드
    public double applyDiscount(double price) {
        return function.apply(price);
    }

}
