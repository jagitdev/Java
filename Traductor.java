package ejerciciosColeccionesDiccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, String> palabras = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        Scanner sce = new Scanner(System.in);

        int valor;

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

        System.out.println("TRADUCTOR");
        System.out.println("1-Traducir del español al inglés una frase introducida por el teclado");
        System.out.println("2-Imprimir diccionario");
        System.out.println("3-Añadir o modificar palabra");
        System.out.println("4-Salir ");
        System.out.println();
        System.out.print("Dime un numero: ");
        valor = sc.nextInt();

        String frase;


        switch (valor)
        {
            case 1:
                System.out.print("Dime una frase: ");
                frase =  sce.nextLine();

                String[] fraseSeparada = frase.split(" ");

                for(int i=0; i< fraseSeparada.length; i++)
                {
                    for (Map.Entry pareja: palabras.entrySet())
                    {
                        if(fraseSeparada[i].equals(pareja.getKey()))
                        {
                            fraseSeparada[i] = (String) pareja.getValue();
                        }
                    }
                }

                System.out.print("Frase traducida: ");

                for(int i=0; i< fraseSeparada.length; i++)
                {
                    System.out.print(fraseSeparada[i] + " ");
                }
                    break;

            case 2:
                for (Map.Entry pareja: palabras.entrySet())
                {
                    System.out.println( pareja);
                }
                break;

            case 3:
                String palabraEs;
                String palabraEn;
                System.out.println("Dime una palabra en Español: ");
                palabraEs = sc.nextLine();
                System.out.println("Dime la palabra anterior en inglés: ");
                palabraEn = sc.nextLine();
                palabras.put(palabraEs, palabraEn);
                break;
            case 4:
                System.out.println("Saliendo . . .");
                break;
            default:
                System.out.print("ERROR");
                break;
        }
    }
}
