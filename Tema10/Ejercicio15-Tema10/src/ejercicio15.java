/**
 *
 * @author alber
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);
        
        Scanner s = new Scanner(System.in);
        String productoIntro = "";
        int cantidadIntro = 0;
        
        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<Integer> listaCantidades = new ArrayList<>();
        
        do {
            System.out.print("Producto: ");
            productoIntro = s.nextLine();
            
            if (!productoIntro.equals("fin")){
                System.out.print("Cantidad: ");
                cantidadIntro = Integer.parseInt((s.nextLine()));
                if (listaProductos.contains(productoIntro)){
                    int posicion = listaProductos.indexOf(productoIntro);
                    listaCantidades.set(posicion, listaCantidades.get(posicion) +cantidadIntro);
                }else {
                    listaProductos.add(productoIntro);
                    listaCantidades.add(cantidadIntro);
                }
            }
        } while (!productoIntro.equals("fin"));
        
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigo = s.nextLine();
        
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        
        double total = 0;
        
        for (int i = 0; i < listaProductos.size(); i++){
            String producto = listaProductos.get(i);
            double precio = productos.get(producto);
            int cantidad = listaCantidades.get(i);
            double subtotal = precio * cantidad;
            total += subtotal;
            System.out.printf("%-8s %7.2f %6d %7.2f\n", producto, precio, cantidad, subtotal);
        }
        
        double descuento = 0;
        
        if (codigo.equals("ECODTO")) {
            descuento = total / 10.0;
            total -= descuento;
        }
        System.out.println("---------------------------------");
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f", total);
    }
    
}
