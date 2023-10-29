package metodosBasicos;
import java.util.ArrayList;
public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(3);
        myList.add(7);
        myList.add(1);

        int maxNumber = myList.get(0); //Suppose the first element is the largest, so far

        for (int i = 1; i < myList.size(); i++) {
            if (myList.get(i) > maxNumber) {
                maxNumber = myList.get(i); //updates the largest number found so far
            }
        }

        System.out.println("The largest number is: " + maxNumber);
    }
}
