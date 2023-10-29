package metodosBasicos;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        String firstFruit = fruits.get(0);
        System.out.println("The first fruit in the list is: " + firstFruit);
        int size = fruits.size();//
        if (size > 0) {
            String lastFruit = fruits.get(size - 1);
            System.out.println("The last fruit in the list is: " + lastFruit);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
