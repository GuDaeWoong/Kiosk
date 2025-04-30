package Lv6;

import Lv4.foodItem.Dessert;
import Lv6.Food.Food;
import Lv6.foodItem.Burger;
import Lv6.foodItem.Drink;

import java.util.Scanner;

public class KioskLv6 {
    //속성
    private MenuLv6 mainMenu = new MenuLv6();

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
        Scanner sc = new Scanner(System.in);
        mainMenu.showMainMenu();
        //shoppingCart에 값이 있을경우 ORDER MENU 오더 메뉴 보여줌
        //Lv7 에서 메서드화 하여 압축
        if (!mainMenu.getShoppingCart().isEmpty()) {
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
            int inputOredr = sc.nextInt();
            // 오더에 있는걸 주문할지 취소할지 조건문
            // 장바구니에 추가된 메뉴를 보여줌
            // 장바구니에 있는 주문금액을 보여줌
            if (inputOredr == 1) {
                mainMenu.showBurgerMenu();
                chooseBurgerMenue(sc);
            } else if (inputOredr == 2) {
                mainMenu.showDrinkMenu();
                chooseDrinkMenue(sc);
            } else if (inputOredr == 3) {
                mainMenu.showDessertMenu();
                chooseDessertMenue(sc);
            } else if (inputOredr == 4) {
                System.out.println("아래와 같이 주문 하시겠습니까?");
                mainMenu.showShoppingCart();
                mainMenu.showTotalMoney();
                // 주문을 진행할지 메뉴판으로 가는지 조건문
                System.out.println("1. 주문          2. 메뉴판");
                int OrderOrMenu = sc.nextInt();
                if (OrderOrMenu == 1) {
                    // 장바구니에 있던 list들의 주문금액들을 반환해주는 메서드 사용
                    System.out.println("주문이 완료되었습니다. 금액은 " + mainMenu.cartTotalMoney() + "입니다.");
                    // “주문하기”를 누르면 장바구니를 초기화
                    mainMenu.clearShoppingCart();
                } else if (OrderOrMenu == 2) {
                    chooseMainMenu();
                }
            } else if (inputOredr == 5) {
                System.out.println("진행주인 주문을 취소하였습니다.");
                chooseMainMenu();
            }
        }
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

    // 장바구니 추가기능
    public void wantAddMenu(int chooseNum, int MineNum, Scanner sc) {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     2. 취소");
        int input = sc.nextInt();
        if (input == 1) {
            inputChoose(chooseNum, MineNum);
            chooseMainMenu();
        } else if (input == 2) {
            System.out.println("장바구니에 추가하지 않으셨습니다");
        } else {
            System.out.println("잘못 입력하셨습니다.");
            wantAddMenu(chooseNum, MineNum, sc);
        }
    }

    // 버거 메뉴 선택 메서드
    public void chooseBurgerMenue(Scanner sc) {
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                wantAddMenu(input, 1, sc);
            } else if (input == 2) {
                wantAddMenu(input, 1, sc);
            } else if (input == 3) {
                wantAddMenu(input, 1, sc);
            } else if (input == 4) {
                wantAddMenu(input, 1, sc);
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
                wantAddMenu(input, 2, sc);
            } else if (input == 2) {
                wantAddMenu(input, 2, sc);
            } else if (input == 3) {
                wantAddMenu(input, 2, sc);
            } else if (input == 4) {
                wantAddMenu(input, 2, sc);
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
                wantAddMenu(input, 3, sc);
            } else if (input == 2) {
                wantAddMenu(input, 3, sc);
            } else if (input == 3) {
                wantAddMenu(input, 3, sc);
            } else if (input == 4) {
                wantAddMenu(input, 3, sc);
            } else if (input == 0) {
                chooseMainMenu();
            } else {
                System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요");
            }
        }
    }

    //선택한 메뉴 불러오는 메서드
    public void inputChoose(int input, int num) {
        for (int i = 1; i <= mainMenu.getFoodsItem().size(); i++) {
            Food temp = mainMenu.getFoodsItem().get(i - 1);
            if (num == 2 && temp instanceof Drink && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
                mainMenu.addShoppingCart(temp);
            } else if (num == 1 && temp instanceof Burger && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
                mainMenu.addShoppingCart(temp);
            } else if (num == 3 && temp instanceof Dessert && temp.getNumber() == input) {
                System.out.println("선택한 메뉴: " + temp.getName() + "   | W " + temp.getPrice() + " | " + temp.getDes() + "\n");
                mainMenu.addShoppingCart(temp);

            }
        }
    }
}

