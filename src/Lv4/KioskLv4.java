package Lv4;

import Lv4.Food.Food;
import Lv4.foodItem.Burger;
import Lv4.foodItem.Dessert;
import Lv4.foodItem.Drink;

import java.util.Scanner;

public class KioskLv4 {
    //속성
    private MenuLv4 mainMenu = new MenuLv4();

    // 키오스크 start
    public void start() {
        mainMenu.addBurgerItems();
        mainMenu.addMainItem();
        mainMenu.addDrinkItems();
        mainMenu.addDessertItems();
        chooseMainMenu();
    }

    // 메인메뉴 고르는 메서드
    public void chooseMainMenu() {
        mainMenu.showMainMenu();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (true) {
            if (input == 1) {
                mainMenu.showBurgerMenu();
                chooseBurgerMenue(sc);
            } else if (input == 2) {
                mainMenu.showDrinkMenu();
                chooseDrinkMenue(sc);
            } else if (input == 3) {
                mainMenu.showDessertMenu();
                chooseDessertMenue(sc);
            } else if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다");
                continue;
            }
        }
    }

    // 버거 메뉴 선택 메서드
    public void chooseBurgerMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputChoose(input, 1);
                chooseMainMenu();
            } else if (input == 2) {
                inputChoose(input, 1);
                chooseMainMenu();
            } else if (input == 3) {
                inputChoose(input, 1);
                chooseMainMenu();
            } else if (input == 4) {
                inputChoose(input, 1);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    //드링크 메뉴 선택 메서드
    public void chooseDrinkMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputChoose(input, 2);
                chooseMainMenu();
            } else if (input == 2) {
                inputChoose(input, 2);
                chooseMainMenu();
            } else if (input == 3) {
                inputChoose(input, 2);
                chooseMainMenu();
            } else if (input == 4) {
                inputChoose(input, 2);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    // 디저트 메뉴 선택 메서드
    public void chooseDessertMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputChoose(input, 3);
                chooseMainMenu();
            } else if (input == 2) {
                inputChoose(input, 3);
                chooseMainMenu();
            } else if (input == 3) {
                inputChoose(input, 3);
                chooseMainMenu();
            } else if (input == 4) {
                inputChoose(input, 3);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    //선택한 메뉴 불러오는 메서드
    public void inputChoose(int input, int num) {
        for (int i = 1; i <= mainMenu.getFoodsItem().size(); i++) {
            Food temp = mainMenu.getFoodsItem().get(i - 1);
            if (num == 2 && temp instanceof Drink && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
            } else if (num == 1 && temp instanceof Burger && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
            } else if (num == 3 && temp instanceof Dessert && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
            }
        }
    }
}

