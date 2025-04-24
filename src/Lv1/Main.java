package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BurgerMenu();
    }

    public static void BurgerMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");
        System.out.println("");
        BurgerMenuInput();
    }

    public static void BurgerMenuInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 입력해 주세요");
        String input = sc.next();

        if (input.equals("1")) {
            System.out.println("ShackBurger");
        } else if (input.equals("2")) {
            System.out.println("SmokeShack");
        } else if (input.equals("3")) {
            System.out.println("Cheeseburger");
        } else if (input.equals("4")) {
            System.out.println("Hamburger");
        } else if (input.equals("0")) {
            System.out.println("종료");
        } else {
            System.out.println("유효한 입력값이 아닙니다.");
            System.out.println("다시 입력해주세요");
            BurgerMenuInput();
        }
    }
}
