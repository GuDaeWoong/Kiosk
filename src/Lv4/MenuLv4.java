package Lv4;

import Lv4.Food.Food;
import Lv4.foodItem.Burger;
import Lv4.foodItem.Dessert;
import Lv4.foodItem.Drink;
import Lv4.foodItem.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuLv4 {
    //속성
    //리스트명 생성 캡슐화
    private List<Food> foods;
    private List<MainMenu> mainItemLv4s;
    //다형성을 사용하여 버거, 드링크, 디저트를 food 하나로 합쳐줌
//    List<Drink> drinkItemLv4s;
//    List<Dessert> dessertsItemLv4s;

    //food 리스트를 가져오기위한 Getter
    //food list getter
    public List<Food> getFoodsItem() {
        return foods;
    }

    public void setfoods(List<Food> foods) {
        this.foods = foods;
    }

    public void setmainItem(List<MainMenu> mainItemLv4s) {
        this.mainItemLv4s = mainItemLv4s;
    }

    // ArrList 공간 확보
    public MenuLv4() {
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
        for (int i = 1; i <= mainItemLv4s.size(); i++) {
            mainItemLv4s.get(i - 1).outputMainMenu(i);
        }
        System.out.println("0. exit  |  종료");
    }

    //버거 메뉴 보여주는 메서드
    public void showBurgerMenu() {
        System.out.println("[ BURGERS MENU ]");

        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i - 1) instanceof Burger) {
                foods.get(i - 1).output();
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }

    //드링크 메뉴 보여주는 메서드
    public void showDrinkMenu() {
        System.out.println("[ DRINK MENU ]");
        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i - 1) instanceof Drink) {
                foods.get(i - 1).output();
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }

    //디저트 메뉴 보여주는 메서드
    public void showDessertMenu() {
        System.out.println("[ DESSERT MENU ]");
        for (int i = 1; i <= foods.size(); i++) {
            if (foods.get(i - 1) instanceof Dessert) {
                foods.get(i - 1).output();
            }
        }
        System.out.println("0. return  |  뒤로가기");
    }
}
