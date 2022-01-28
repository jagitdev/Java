package ejerciciosColeccionesDiccionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BarajaEspañola {
    public static void main(String[] args) {
        ArrayList<String> nombreBaraja = new ArrayList<String>();

        HashMap<Integer, String> valorBaraja = new HashMap<Integer, String>();

        valorBaraja.put(1, "as");
        valorBaraja.put(2, "dos");
        valorBaraja.put(3, "tres");
        valorBaraja.put(4, "cuatro");
        valorBaraja.put(5, "cinco");
        valorBaraja.put(6, "seis");
        valorBaraja.put(7, "siete");
        valorBaraja.put(8, "ocho");
        valorBaraja.put(9, "nueve");
        valorBaraja.put(10, "Sota");
        valorBaraja.put(11, "Caballo");
        valorBaraja.put(12, "Rey");

        nombreBaraja.add("oros");
        nombreBaraja.add("copas");
        nombreBaraja.add("espadas");
        nombreBaraja.add("bastos");

        int contador = 0;


        for (int i=0; i<5; i++){
            int randomCartaValor = (int) (1+Math.random()*11+1);
            System.out.print(valorBaraja.get(randomCartaValor) + " ");
            contador = contador + randomCartaValor;

            int randomCartaNombre = (int) (Math.random()*4);
            System.out.println(nombreBaraja.get(randomCartaNombre));
        }

        System.out.println("El valor de las cartas es: " + contador);


    }
}
