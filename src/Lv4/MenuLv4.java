package Lv4;

import Lv4.Food.Food;
import Lv4.foodItem.Burger;
import Lv4.foodItem.Dessert;
import Lv4.foodItem.Drink;
import Lv4.foodItem.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuLv4 {

    //리스트명 생성
    List<Food> foods;
    List<MainMenu> mainItemLv4s;
//    List<Drink> drinkItemLv4s;
//    List<Dessert> dessertsItemLv4s;



    // ArrList 공간 확보
    public MenuLv4() {
        this.foods = new ArrayList<>();
        this.mainItemLv4s = new ArrayList<>();

    }

    //enum
    public void addBurgerItems() {
        foods.add(new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        foods.add(new Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        foods.add(new Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        foods.add(new Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void addMainItem() {
        mainItemLv4s.add(new MainMenu("Burgers"));
        mainItemLv4s.add(new MainMenu("Drinks"));
        mainItemLv4s.add(new MainMenu("Desserts"));
    }

    public void addDrinkItems() {
        foods.add(new Drink("Sider", 1.0, "사이다"));
        foods.add(new Drink("CocaCola", 1.0, "콜라"));
        foods.add(new Drink("MountainDew", 1.0, "마운틴듀"));
        foods.add(new Drink("Fanta", 1.0, "환타"));
    }

    public void addDessertItems() {
        foods.add(new Dessert("FrenchFries", 2.0, "감튀"));
        foods.add(new Dessert("Nugget", 2.5, "너겟"));
        foods.add(new Dessert("CheeseStick", 3.0, "치즈스틱"));
        foods.add(new Dessert("Coleslaw", 1.5, "코울슬로"));
    }


    public void showMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 1; i <= mainItemLv4s.size(); i++) {
            mainItemLv4s.get(i-1).outputMainMenu(i);
        }
        System.out.println("0. exit  |  종료");
    }

    public void showBurgerMenu() {
        System.out.println("[ BURGERS MENU ]");

        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i-1) instanceof Burger) {
                foods.get(i-1).output(i);
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }

    public void showDrinkMenu() {
        System.out.println("[ DRINK MENU ]");
        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i-1) instanceof Drink) {
                foods.get(i-1).output(i);
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }

    public void showDessertMenu() {
        System.out.println("[ DESSERT MENU ]");
        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i-1) instanceof Drink) {
                foods.get(i-1).output(i);
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }
}
