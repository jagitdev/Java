package ejerciciosColeccionesDiccionarios;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/*
Implementa el control de acceso al área restringida de un programa. Se debe
pedir un nombre de usuario y una contraseña. Si el usuario introduce los
datos correctamente, el programa dirá “Ha accedido al área restringida”. El
usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
de usuario con sus correspondientes contraseñas deben estar almacenados en
una estructura de la clase HashMap .
 */

public class EjercicioPdf6 {
    public static void main(String[] args) {
        HashMap<String, String> datosUsuarios = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        //                  key      value
        datosUsuarios.put("Javier", "2002");

        String nombre;
        String contra;

        //contador

        for (int i=3-1; i>=0;i--)
        {
            System.out.print("Dime tu nombre: ");
            nombre = sc.nextLine();
            System.out.print("Dime tu contra: ");
            contra = sc.nextLine();
            for (Map.Entry datos: datosUsuarios.entrySet()) {
                if (datos.getKey().equals(nombre))
                {
                    if (datos.getValue().equals(contra))
                    {
                        System.out.print("Bienvenido...");
                    }
                    else
                    {
                        System.out.print("Tienes " + i + " oportunidades.");
                    }

                }
                else
                {
                    System.out.println("Tienes " + i + " oportunidades.");
                }
            }
        }
        System.out.print("Error . . .");



    }
}
