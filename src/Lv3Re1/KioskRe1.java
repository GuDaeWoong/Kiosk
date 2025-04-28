package Lv3Re1;


import java.util.List;
import java.util.Scanner;

public class KioskRe1 {

    //List 생성
    List<MenuItemLv3Re1> menuItem_re1;

    //생성자
    //리스트를 받아 들여오기위함
    public KioskRe1(List<MenuItemLv3Re1> menuItem_re1) {
        this.menuItem_re1 = menuItem_re1;
    }

    // 메서드 실행시키는 메서드
    public void start() {
        // 메뉴 프린트
        printMenuItem();
        //메뉴 선택
        chooseItem();
    }

    // MenuItem를 순차적으로 불러와주는 메서드
    public void printMenuItem() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 1; i <= menuItem_re1.toArray().length; i++) {
            menuItem_re1.get(i - 1).outputMenuItem(i);
        }
        System.out.println("0. 종료      | 종료");
    }

    // 숫자를 입력받고 맞는 값에 맞춰 값을 반환시켜주는 메서드
    public void chooseItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴를 보고 숫자를 입력해 주세요");
        int input = sc.nextInt();

        while (true) {
            if (input == 1) {
                menuItem_re1.get(input - 1).outputMenuItem(input);
                break;
            } else if (input == 2) {
                menuItem_re1.get(input - 1).outputMenuItem(input);
                break;
            } else if (input == 3) {
                menuItem_re1.get(input - 1).outputMenuItem(input);
                break;
            } else if (input == 4) {
                menuItem_re1.get(input - 1).outputMenuItem(input);
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
