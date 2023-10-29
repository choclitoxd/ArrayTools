package metodosBasicos;

import java.util.ArrayList;
import java.util.Collections;

public class SetList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Juan");
        names.add("Carlos");
        names.add("Maria");

        if (names.size() >= 2) {
            names.set(1, "Ana");
        }

        System.out.println(names);

        //Remove
        if (!names.isEmpty()) {
            names.remove(0);
        }

        System.out.println(names);

        //Check
        boolean esPresente = names.contains("Carlos");

        if (esPresente) {
            System.out.println("The name Carlos is present in the ArrayList.");
        } else {
            System.out.println("The name Carlos is not present in the ArrayList.");
        }
        //Add the name "Pedro" in the second position of the ArrayList "names"
        names.add(1, "Pedro");
        System.out.println("ArrayList after adding \"Pedro\": " + names);
        Collections.sort(names);

        System.out.println("Names arranged alphabetically: " + names);
    }
}
