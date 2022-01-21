package ejerciciosColeccionesDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> Array = new ArrayList<Integer>();

        //25 y 75 (int)(Math.random()*(75-25+1)+25);
        int numeroArrayAle = ((int)(Math.random()*(20-10+1)+10));
        System.out.println(numeroArrayAle);

        for(int i=0; i<numeroArrayAle; i++){
            Array.add((int)(Math.random()*100+1));
        }

        System.out.println();
        for(Integer cadena:Array){
            System.out.println(cadena);
        }

        //suma
        int suma=0;
        for(Integer cadena:Array){
            suma=suma+cadena;
        }
        System.out.println();
        System.out.println("La suma es: " + suma);

        //media
        int media=suma/numeroArrayAle;
        System.out.println();
        System.out.print("La media es: " + media);

        //mayor y minimo
        int max = 0;
        int min = 0;

        System.out.println();
        Collections.sort(Array);

        System.out.println("Numero menor: " + Array.get(0));
        int index = Array.size() - 2;
        System.out.println("Numero mayor " + Array.get(index +1));
    }
}
