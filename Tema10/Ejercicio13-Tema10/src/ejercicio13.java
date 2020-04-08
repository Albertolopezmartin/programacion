/**
 *
 * @author alber
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList <Articulo> a = new ArrayList<>();
    
    public static void main(String[] args) {
        HashMap<String, Integer> lineasFra = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int opcion;
        int opcion2;
        int i;
        int stockIntro;
        int unidades = 0;
        int unidadesEnFactura = 0;
        double precioDeCompraIntro;
        double precioDeVentaIntro;
        double subtotal;
        double baseImponible;
        double totalFactura;
        String codigo;
        String codigoIntro = "";
        String descripcionIntro;
        String precioDeCompraIntroString;
        String precioDeVentaIntroString;
        String stockIntroString;
        
        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = s.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("LISTADO");
                    System.out.println("================");
                    
                    for (Articulo aux : a) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    System.out.println("NUEVO ARTICULO");
                    System.out.println("================");
                    
                    System.out.println("Por favor, introduzca los datos del articulo.");
                    System.out.print("Código: ");
                    
                    do {
                        codigoIntro = s.nextLine();
                        if (posicion(codigoIntro) != -1){
                            System.out.println("Ese código ya existe.");
                            System.out.println("Introduzca otro codigo:");
                        }
                    } while (posicion(codigoIntro) != -1);
                    
                    System.out.print("Descripcion: ");
                    descripcionIntro = s.nextLine();
                    
                    System.out.print("Precio de compra: ");
                    precioDeCompraIntro = s.nextDouble();
                    
                    System.out.print("Precio de venta: ");
                    precioDeVentaIntro = s.nextDouble();
                    
                    System.out.print("Stock: ");
                    stockIntro = s.nextInt();
                    
                    a.add(new Articulo (codigoIntro, descripcionIntro, precioDeCompraIntro, precioDeVentaIntro, stockIntro));
                    
                    break;
                case 3:
                    System.out.println("BAJA");
                    System.out.println("================");
                    System.out.print("Por favor, introduzca el codigo del articulo que desea dar de baja: ");
                    codigoIntro = s.nextLine();
                    
                    if (posicion(codigoIntro) != -1){
                        System.out.println("Lo siento, el codigo introducido no existe.");
                    } else {
                        a.remove(posicion(codigoIntro));
                        System.out.println("articulo borrado.");
                    }
                    
                    break;
                case 4:
                    System.out.println("MODIFICACION");
                    System.out.println("================");
                    System.out.print("Por favor, introduzca el codigo del articulo que desea modificar: ");
                    do{
                        codigoIntro = s.nextLine();
                        if (posicion(codigoIntro) != -1){
                            System.out.println("No hay ningun articulo con ese codigo");
                            System.out.print("Introduzca otro codigo: ");
                        }
                    } while (posicion(codigoIntro) != -1);
                    i = posicion(codigoIntro);
                    
                    System.out.println("Introduzca los nuevos datos del articulo o INTRO para dejarlos igual.");
                    
                    System.out.println("Codigo: "+ a.get(i).getCodigo());
                    System.out.print("Nuevo codigo: ");
                    codigoIntro = s.nextLine();
                    if (!codigoIntro.equals("")) {
                        a.get(i).setCodigo(codigoIntro);
                    }
                    
                    System.out.println("Descripcion: "+ a.get(i).getDescripcion());
                    System.out.print("Nueva descripcion: ");
                    descripcionIntro = System.console().readLine();
                    if (!descripcionIntro.equals("")){
                        a.get(i).setDescripcion(descripcionIntro);
                    }
                    
                    System.out.println("Precio de compra: "+ a.get(i).getPrecioDeCompra());
                    System.out.print("Nuevo precio de compra: ");
                    precioDeCompraIntroString = System.console().readLine();
                    if (!precioDeCompraIntroString.equals("")){
                        a.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroString));
                    }
                    
                    System.out.println("Precio de venta: "+ a.get(i).getPrecioDeVenta());
                    System.out.print("Nuevo precio de venta: ");
                    precioDeVentaIntroString = System.console().readLine();
                    if (!precioDeVentaIntroString.equals("")){
                        a.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroString));
                    }
                    
                    System.out.println("Stock: "+ a.get(i).getStock());
                    System.out.print("Nuevo Stock: ");
                    stockIntroString = System.console().readLine();
                    if (!stockIntroString.equals("")){
                        a.get(i).setStock(Integer.parseInt(stockIntroString));
                    }
                    
                    break;
                case 5:
                    System.out.println("ENTRADA DE MERCANCIA");
                    System.out.println("================");
                    System.out.print("Por favor, introduzca el codigo del articulo: ");
                    codigoIntro = s.nextLine();
                    do {
                        codigoIntro = s.nextLine();
                        if (posicion(codigoIntro) != -1){
                            System.out.println("No hay ningun articulo con ese codigo");
                            System.out.print("Introduzca otro codigo: ");
                        }
                    } while (posicion(codigoIntro) == -1);
                    
                    i = posicion(codigoIntro);
                    
                    System.out.println("Entrada de mercancía del siguiente articulo: ");
                    System.out.println(a.get(i));
                    System.out.print("Introduzca el número de unidades que entran al almacén: ");
                    stockIntro = s.nextInt();
                    a.get(i).setStock(stockIntro + a.get(i).getStock());
                    System.out.println("La mercancía ha entrado en el almacén.");
                    
                    break;
                case 6:
                    System.out.println("VENTA");
                    System.out.println("================");
                    
                    do {
                        System.out.println("1. Añadir artículo");
                        System.out.println("2. Generar factura");
                        System.out.println("3. Cancelar");
                        System.out.print("Introduzca una opción: ");
                        opcion2 = s.nextInt();
                        
                        switch(opcion2){
                            case 1:
                                System.out.println("Por favor, introduzca el código del artículo: ");
                                codigoIntro = s.nextLine();
                                i = posicion(codigoIntro);
                                
                                if (i == -1){
                                    System.out.println("No hay ningún artículo con ese código.");
                                } else {
                                    System.out.println(a.get(i));
                                    
                                    if (lineasFra.containsKey(codigoIntro)) {
                                        unidadesEnFactura = lineasFra.get(codigoIntro);
                                    } else {
                                        unidadesEnFactura = 0;
                                    }
                                    
                                    System.out.println("Unidades en la factura provisional: " + unidadesEnFactura);
                                    
                                    System.out.print("Unidades que quiere incorporar a la factura: ");
                                    unidades = s.nextInt();
                                    
                                    if ((a.get(i).getStock()) - unidadesEnFactura < unidades) {
                                        System.out.println("No hay suficiente stock. Puede añadir a la venta un máximo de " + (a.get(i).getStock() - unidadesEnFactura) + " unidades de ese producto.");
                                    } else if (lineasFra.containsKey(codigoIntro)) {
                                        lineasFra.put(codigoIntro, lineasFra.get(codigoIntro) + unidades);
                                    } else {
                                        lineasFra.put(codigoIntro, unidades);
                                    }
                                }
                                
                                System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                System.out.println("------------------------------------------------------------------");
                                for (Map.Entry pareja: lineasFra.entrySet()) {
                                    codigo = pareja.getKey().toString();
                                    i = posicion(codigo);
                                    unidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = unidades * a.get(i).getPrecioDeVenta();
                                    System.out.printf(" %6s | %17s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                                }
                                
                                break;
                            case 2:
                                baseImponible = 0;
                                System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                System.out.println("------------------------------------------------------------------");
                                for (Map.Entry pareja: lineasFra.entrySet()) {
                                    codigo = pareja.getKey().toString();
                                    i = posicion(codigo);
                                    unidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = unidades * a.get(i).getPrecioDeVenta();
                                    System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                                    baseImponible += subtotal;
                                    a.get(i).setStock(a.get(i).getStock() - unidades);
                                }
                                
                                System.out.println("----------------------------------------------------------------");
                                System.out.printf(" BASE IMPONIBLE: %8.2f \n", baseImponible);
                                System.out.printf(" IVA (21%%): %8.2f \n", baseImponible * 0.21);
                                System.out.printf(" TOTAL: %8.2f \n", baseImponible * 1.21);
                                
                                System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menú principal");
                                
                                s.nextLine();
                                break;
                        } 
                         
                    }while (opcion2 == 1);
                    break;
            }
        } while (opcion != 7);
    }
    static public int posicion (String codigo) {
        int i =-1;
        for (Articulo aux : a) {
            i++;
            if (aux.getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
    
}
