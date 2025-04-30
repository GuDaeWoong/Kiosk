package Lv7;

import Lv7.Food.Food;
import Lv7.FoodItem.Burger;
import Lv7.FoodItem.Dessert;
import Lv7.FoodItem.Drink;
import Lv7.FoodItem.MainMenu;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MenuLv7 {
    //속성
    //리스트명 생성 캡슐화
    private List<Food> foods;
    private List<MainMenu> mainItemLv4s;
    private List<Food> cart = new ArrayList<>();

    // 장바구니 추가 메서드
    public void addShoppingCart(Food shoppingFood) {
        cart.add(shoppingFood);
        System.out.println(shoppingFood.getName() + " 이 장바구니에 추가되었습니다.");
    }

    // 쇼핑카트 추가
    public List<Food> getShoppingCart() {
        return cart;
    }

    //food 리스트를 가져오기위한 Getter
    //food list getter
    public List<Food> getFoodsItem() {
        return foods;
    }

    // setter음식
    public void setfoods(List<Food> foods) {
        this.foods = foods;
    }

    // setter MainMenu
    public void setmainItem(List<MainMenu> mainItemLv4s) {
        this.mainItemLv4s = mainItemLv4s;
    }

    // ArrList 공간 확보
    public MenuLv7() {
        this.foods = new ArrayList<>();
        this.mainItemLv4s = new ArrayList<>();
    }

    // 메인메뉴 리스트 추가
    public void addMainItem() {
        mainItemLv4s.add(new MainMenu("Burgers"));
        mainItemLv4s.add(new MainMenu("Drinks"));
        mainItemLv4s.add(new MainMenu("Desserts"));
    }

    // Burger 메뉴 추가
    public void addBurgerItems() {
        foods.add(new Burger(1, "ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        foods.add(new Burger(2, "SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        foods.add(new Burger(3, "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        foods.add(new Burger(4, "Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 드링크 메뉴 추가
    public void addDrinkItems() {
        foods.add(new Drink(1, "Sider", 1.0, "사이다"));
        foods.add(new Drink(2, "CocaCola", 1.0, "콜라"));
        foods.add(new Drink(3, "MountainDew", 1.0, "마운틴듀"));
        foods.add(new Drink(4, "Fanta", 1.0, "환타"));
    }

    // 디저트 메뉴 추가
    public void addDessertItems() {
        foods.add(new Dessert(1, "FrenchFries", 2.0, "감튀"));
        foods.add(new Dessert(2, "Nugget", 2.5, "너겟"));
        foods.add(new Dessert(3, "CheeseStick", 3.0, "치즈스틱"));
        foods.add(new Dessert(4, "Coleslaw", 1.5, "코울슬로"));
    }

    //메인 메뉴 보여주는 메서드
    public void showMainMenu() {
        System.out.println("[ MAIN MENU ]");
        // 기존 메인메뉴 stream화
        IntStream.rangeClosed(1, mainItemLv4s.size())
                .forEach(i -> mainItemLv4s.get(i - 1).outputMainMenu(i));
        System.out.println("0. exit  |  종료");
    }

    //버거 메뉴 보여주는 메서드
    public void showBurgerMenu() {
        System.out.println("[ BURGERS MENU ]");
        //버거 메뉴 스트림화 foods에서 버거만 필터링하여 메서드를 각각호출
        foods.stream()
                .filter(food -> food instanceof Burger)
                .forEach(food -> food.output());
        System.out.println("0. return  |  뒤로가기");
    }

    //드링크 메뉴 보여주는 메서드
    public void showDrinkMenu() {
        System.out.println("[ DRINK MENU ]");

        foods.stream()
                .filter(food -> food instanceof Drink)
                .forEach(food -> food.output());
        System.out.println("0. return  |  뒤로가기");
    }

    //디저트 메뉴 보여주는 메서드
    public void showDessertMenu() {
        System.out.println("[ DESSERT MENU ]");

        foods.stream()
                .filter(food -> food instanceof Dessert)
                .forEach(food -> food.output());
        System.out.println("0. return  |  뒤로가기");
    }

    // 장바구니 보여주는 메서드
    public void showShoppingCart() {
        System.out.println("");
        System.out.println("[ Orders ]");
        cart.stream()
                .forEach(item -> item.output());
    }

    // 장바구니에 있는 total 타이틀과 내야할 금액을 보여줌
    public void showTotalMoney() {
        System.out.println("");
        System.out.println("[ Total ]");
        double totalmoney = 0.0;
        for (int i = 1; i <= cart.size(); i++) {
            totalmoney += cart.get(i - 1).getPrice();
        }
        System.out.println("W " + totalmoney);
    }

    // 장바구니에 있는 모든 금액계산
    public double cartTotalMoney() {
        double totalmoney = 0.0;
        for (int i = 1; i <= cart.size(); i++) {
            totalmoney += cart.get(i - 1).getPrice();
        }
        return (totalmoney);
    }

    //ORDER MENU 를 보여주는 메서드
    public void showOrderMenu() {
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
    }

}
