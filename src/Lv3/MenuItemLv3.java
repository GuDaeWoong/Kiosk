package Lv3;


public class MenuItemLv3 {
    // 속
    String name;
    double price;
    String description;

    //생
    public MenuItemLv3(String name, double price, String description) {
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
    public String getDescription() {
        return description;
    }

    public void outputMenuItem(int num) {
        System.out.println(num+ ". "+name +"   | W "+ price+" | " + description);
    }

}