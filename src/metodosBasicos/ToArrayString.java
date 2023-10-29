package metodosBasicos;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayString {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("Hello", "World", "Java"));
        String mensaje = "";
        for (String palabra:palabras) {
            mensaje = mensaje + " " + palabra;
        }
        System.out.println("Este es el mensaje");
    }

}
