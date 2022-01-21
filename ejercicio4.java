package ejerciciosColeccionesDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> letras = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String letra;

        for(int i=0; i<10; i++){
            System.out.println("dime una letra: ");
            letra = sc.nextLine();
            letras.add(letra);
        }
        Collections.sort(letras);
        System.out.println(letras);
    }
}
