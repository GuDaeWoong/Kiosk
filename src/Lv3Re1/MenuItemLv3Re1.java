package Lv3Re1;


public class MenuItemLv3Re1 {

    //속
    String name;
    double price;
    String description;

    //생
    public MenuItemLv3Re1(String itemname,double money, String des) {
        this.name = itemname;
        this.price = money;
        this.description = des;
    }


    //기
    public String getItemname() {
        return name;
    }
    public double getmoney() {
        return price;
    }
    public String getdes() {
        return description;
    }

    //MenuItem을 간소화 시키기 위한 메서드
    public void outputMenuItem(int num) {
        System.out.println(num+ ". "+name +"   | W "+ price+" | " + description);
    }
}
