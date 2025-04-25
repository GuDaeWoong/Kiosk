package Lv4;
import java.util.Scanner;

public class KioskLv4 {

    MenuLv4 mainMenu= new MenuLv4();

    public void start() {
        mainMenu.addBurgerItems();
        mainMenu.addMainItem();
        mainMenu.addDrinkItems();
        mainMenu.addDessertItems();
        chooseMainMenu();
    }

    public void chooseMainMenu() {
        mainMenu.showMainMenu();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(true) {
            if (input==1) {
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

    public void chooseBurgerMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputChooseBurger(input);
                chooseMainMenu();
            } else if (input == 2){
                inputChooseBurger(input);
                chooseMainMenu();
            }else if (input == 3){
                inputChooseBurger(input);
                chooseMainMenu();
            } else if (input == 4) {
                inputChooseBurger(input);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    public void inputChooseBurger(int input) {
        System.out.println("선택한 메뉴: " + mainMenu.foods.get(input-1).getName() + "   | W " + mainMenu.foods.get(input-1).getPrice() + " | " + mainMenu.foods.get(input-1).getDes()+"\n");
    }

    public void chooseDrinkMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputDrinkBurger(input);
                chooseMainMenu();
            } else if (input == 2){
                inputDrinkBurger(input);
                chooseMainMenu();
            }else if (input == 3){
                inputDrinkBurger(input);
                chooseMainMenu();
            } else if (input == 4) {
                inputDrinkBurger(input);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    public void inputDrinkBurger(int input) {
        System.out.println("선택한 메뉴: " + mainMenu.foods.get(input-1).getName() + "   | W " + mainMenu.foods.get(input-1).getPrice() + " | " + mainMenu.foods.get(input-1).getDes()+"\n");
    }

    public void chooseDessertMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                inputDessertBurger(input);
                chooseMainMenu();
            } else if (input == 2){
                inputDessertBurger(input);
                chooseMainMenu();
            }else if (input == 3){
                inputDessertBurger(input);
                chooseMainMenu();
            } else if (input == 4) {
                inputDessertBurger(input);
                chooseMainMenu();
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
                continue;
            }
        }
    }

    public void inputDessertBurger(int input) {
        System.out.println("선택한 메뉴: " + mainMenu.foods.get(input-1).getName() + "   | W " + mainMenu.foods.get(input-1).getPrice() + " | " + mainMenu.foods.get(input-1).getDes()+"\n");
    }


}

