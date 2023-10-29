package metodosBasicos;

import java.util.ArrayList;

public class BrowseList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int number : numbers) {
            System.out.println(number);
        }
        //Duplicate
        ArrayList<Integer> duplicatedNumbers = new ArrayList<>();
        for (int number : numbers) {
            duplicatedNumbers.add(number);
            duplicatedNumbers.add(number);
        }

        System.out.println(duplicatedNumbers);
        // remove all elements from ArrayList
        numbers.clear();

        System.out.println("ArrayList after removing elements: " + numbers);
    }
}
