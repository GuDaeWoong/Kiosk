package Lv2;

public class MenuItem {
    // 속
    String name;
    double price;
    String description;

    //생
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //기
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getdescription() {
        return description;
    }

    // 메서드
    public void outputMenuItem(int num) {
        System.out.println(num+ ". "+name +"   | W "+ price+" | " + description);
    }

}