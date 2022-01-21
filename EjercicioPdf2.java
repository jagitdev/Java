package ejerciciosColeccionesDiccionarios;

import java.util.ArrayList;

public class EjercicioPdf2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Javi");
        nombres.add("luis");
        for(String nombre: nombres)
        {
            System.out.println(nombre);
        }
    }
}
