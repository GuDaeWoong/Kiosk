package Lv3Re1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당
    List<MenuItemLv3Re1> menuItem_re1 = new ArrayList<>();

    //List 안에 데이터 추가
    public void addItem() {
        menuItem_re1.add(new MenuItemLv3Re1("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItem_re1.add(new MenuItemLv3Re1("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem_re1.add(new MenuItemLv3Re1("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItem_re1.add(new MenuItemLv3Re1("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }


    public static void main(String[] args) {
        //Main 클래스의 인스턴스를
        // 통해 클래스의 메서드와 변수를 들고오기위함
        Main main = new Main();
        main.addItem();
        //KioskRe1 위와 동일
        KioskRe1 kioskRe1 = new KioskRe1(main.menuItem_re1);
        kioskRe1.start();
    }
}