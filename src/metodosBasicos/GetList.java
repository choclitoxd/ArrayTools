package metodosBasicos;
import java.util.ArrayList;
import java.util.Arrays;
public class GetList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        if (numbers.size() >= 3) {
            System.out.println("The third item on the list is: " + numbers.get(2));
        } else {
            System.out.println("The list does not have enough items -x-");
        }
    }
}
