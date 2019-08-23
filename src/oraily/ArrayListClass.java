package oraily;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Button> btnList = new ArrayList<>();

        Button one = new Button();
        Button two = new Button();

        one.setTitle("Pay");
        one.setColor("Blue");
        two.setTitle("Buy");
        two.setColor("Green");

        btnList.add(one);
        btnList.add(two);

        System.out.println(btnList.size());
    }
}
