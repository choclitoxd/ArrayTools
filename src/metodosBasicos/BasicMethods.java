package metodosBasicos;
import java.util.ArrayList;
import java.util.List;
public class BasicMethods {
    /*
    1. add(E element): Este método agrega un elemento al final de la lista.

    2.remove(int index): Este método elimina el elemento en la posición especificada en la lista.

    3.get(int index): Este método devuelve el elemento en la posición especificada en la lista.

    4.set(int index, E element): Este método reemplaza el elemento en la posición especificada con el elemento dado.

    5.size(): Este método devuelve el número de elementos en la lista.

    6.isEmpty(): Este método devuelve true si la lista está vacía y false si no lo está.*/

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("John"); // Adds an element to the end of the list
        myList.add("Jane");

        System.out.println(myList.get(0)); // Prints: John

        myList.set(0, "Mark"); // Replaces the element at the specified position

        System.out.println(myList.get(0)); // Prints: Mark

        myList.remove(1); // Removes the element at the specified position

        System.out.println(myList.size()); // Prints: 1

        System.out.println(myList.isEmpty()); // Prints: false
    }
}
