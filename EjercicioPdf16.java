package ejerciciosColeccionesDiccionarios;

/*
Un supermercado de productos ecológicos nos ha pedido hacer un programa
para vender su mercancía. En esta primera versión del programa se tendrán
en cuenta los productos que se indican en la tabla junto con su precio. Los
productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
indicar el producto y el número de unidades que se compran, por ejemplo
“guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
“fin. Suponemos que el usuario no va a intentar comprar un producto que
no existe. Utiliza un diccionario para almacenar los nombres y precios de los
productos y una o varias listas para almacenar la compra que realiza el usuario.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjercicioPdf16 {
    public static void main(String[] args) {
        HashMap<String, Integer> productos = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);

        productos.put("avena", (int) 2.21);
        productos.put("garbanzos", (int) 2.39);
        productos.put("tomate", (int) 1.59);
        productos.put("jengibre", (int) 3.13);
        productos.put("quinoa", (int) 4.50);
        productos.put("avena", (int) 2.21);
        productos.put("guisantes", (int) 1.60);

        String nombreProducto;

        System.out.print("Dime el producto que quieres: ");
        nombreProducto = sc.nextLine();

        boolean existe = false;
        boolean fin = false;

        for (Map.Entry producto: productos.entrySet()) {
            if (producto.getKey() != nombreProducto)
            {
                existe = true;
            }
            else {existe = false;}
        }

        if (existe == true)
        {
            System.out.print("No existe " + nombreProducto);
        }




    }
}
