package ejerciciosColeccionesDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        HashMap<String, String> palabras = new HashMap<String, String>();

        Scanner sc = new Scanner(System.in);

        palabras.put("tu", "you");
        palabras.put("yo", "I");
        palabras.put("necesito", "need");
        palabras.put("El", "he");
        palabras.put("esta", "is");
        palabras.put("feliz", "happy");
        palabras.put("perro", "dog");
        palabras.put("aprender", "learn");
        palabras.put("mejor", "better");
        palabras.put("donde", "where");

        String palabraEs;
        String palabraEn;
        System.out.println("Dime una palabra en Español: ");
        palabraEs = sc.nextLine();
        System.out.println("Dime la palabra anterior en inglés: ");
        palabraEn = sc.nextLine();
        palabras.put(palabraEs, palabraEn);






    }
}
