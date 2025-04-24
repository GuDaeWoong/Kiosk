package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLv2 {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

//        System.out.println(menuItems.toArray().length);
//        System.out.println(menuItems.get(1).name);
//
        for (int i = 0 ;i<menuItems.toArray().length;i++) {
            System.out.println((i+1)+ ". "+ menuItems.get(i).name+"   | W "+menuItems.get(i).price+" | "+menuItems.get(i).description);
        }
        System.out.println("0. 종료      | 종료");

        System.out.println("어떤 항목을 고르시겠습니까\n번호를 입력해 주세요");
        int input = sc.nextInt();

        if (input == 1) {
            System.out.println((input)+ ". "+ menuItems.get(input).name+"   | W "+menuItems.get(input).price+" | "+menuItems.get(input).description);
        } else if (input == 2) {
            System.out.println((input)+ ". "+ menuItems.get(input).name+"   | W "+menuItems.get(input).price+" | "+menuItems.get(input).description);
        } else if (input == 3) {
            System.out.println((input)+ ". "+ menuItems.get(input).name+"   | W "+menuItems.get(input).price+" | "+menuItems.get(input).description);
        } else if (input == 4) {
            System.out.println((input) + ". " + menuItems.get(input).name + "   | W " + menuItems.get(input).price + " | " + menuItems.get(input).description);
        } else if (input == 0) {
            System.out.println("0. 종료      | 종료");
        } else {
            System.out.println("유효한 입력값이 아닙니다.");
            System.out.println("다시 입력해주세요");
        }
    }
}
