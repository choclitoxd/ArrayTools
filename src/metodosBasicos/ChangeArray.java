package metodosBasicos;
import java.util.ArrayList;
import java.util.List;
public class ChangeArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Soraya");
        list.add("Luis");
        list.add("Sofía");
        list.replaceAll(ignored -> "Hola");
        System.out.println(list);
    }
}
