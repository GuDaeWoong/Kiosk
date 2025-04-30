package Lv7.FoodItem;

public class MainMenu {
    String mainName;

    public MainMenu(String mainName) {
        this.mainName = mainName;
    }

    public String getMainName() {
        return mainName;
    }

    // 메서드
    public void outputMainMenu(int num) {
        System.out.println(num + ". " + mainName);
    }
}
