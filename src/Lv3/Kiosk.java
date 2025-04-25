package Lv3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    //menuItems 리스트 변수 선언
    List<MenuItemLv3> menuItems;

    //생성자
    public Kiosk() {
        this.menuItems = new ArrayList<>();
    }

    public void start() {
        // 메뉴 추가
        addMenuItem();
        // 메뉴들 프린트
        printMenuItem();
        // 메뉴선택
        chooseMenu();
    }

    // List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당
    public void addMenuItem() {
        menuItems.add(new MenuItemLv3("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItemLv3("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItemLv3("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItemLv3("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void printMenuItem() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 1; i <= menuItems.toArray().length; i++) {
            menuItems.get(i-1).outputMenuItem(i);
        }
        System.out.println("0. 종료      | 종료");
    }



    public void chooseMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 항목을 고르시겠습니까\n번호를 입력해 주세요");
        int input = sc.nextInt();

        while (true) {
            if (input == 1) {
                menuItems.get(input-1).outputMenuItem(input);
                break;
            } else if (input == 2) {
                menuItems.get(input-1).outputMenuItem(input);
                break;
            } else if (input == 3) {
                menuItems.get(input-1).outputMenuItem(input);
                break;
            } else if (input == 4) {
                menuItems.get(input-1).outputMenuItem(input);
                break;
            } else if (input == 0) {
                System.out.println("0. 종료      | 종료");
                break;
            } else {
                System.out.println("유효한 입력값이 아닙니다.");
                System.out.println("다시 입력해주세요");
                continue;
            }
        }
    }
}



