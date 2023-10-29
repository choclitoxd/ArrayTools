package metodosBasicos;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class FilterList {
    /*Un Predicate es una interfaz funcional que acepta un argumento
    y devuelve un valor booleano. Se utiliza comúnmente en operaciones de filtrado y prueba.*/
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Define a Predicate to remove even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;

        // Use the removeIf() method to remove even numbers
        numbers.removeIf(isEven);

        // Print the resulting list
        System.out.println(numbers);
    }

}
