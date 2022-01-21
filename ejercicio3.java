package ejerciciosColeccionesDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int numero;

        for(int i=0; i<10; i++){
            System.out.println("dime un nuemro: ");
            numero = sc.nextInt();
            numeros.add(numero);
        }
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
