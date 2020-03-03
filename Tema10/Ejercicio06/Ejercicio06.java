/**
 *
 * @author Alberto López Martín
 */

import java.util.*;

public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> restringido = new HashMap<>();
        
        String usuario;
        String clave;
        boolean acceso = false;
        int oportunidades = 3;
        
        restringido.put("admin", "123456789");
        restringido.put("Alberto", "6611");
        restringido.put("maria", "ztf99");
        
        System.out.println("Introduce el nombre de usuario y contraseña para entrar al area restringida, tienes 3 intentos");
        
        do {
            System.out.print("Usuario: ");
            usuario = s.nextLine();
            System.out.print("Contraseña:");
            clave = s.nextLine();
            
            if (restringido.containsKey(usuario)){
                if (restringido.get(usuario).equals(clave)){
                    System.out.println("Usuario y contraseña correctos, has accedido al area restringida");
                    acceso = true;
                } else {
                    System.out.println("ERROR: Contraseña incorrecta");
                }
            } else {
                System.out.println("ERROR: Ese nombre de usuario no existe");
            }
            
            oportunidades--;
            
            if ((!acceso) && (oportunidades > 0)) {
                System.out.println("Le quedan " + (oportunidades) + " oportunidades");
            }
        } while ((!acceso) && (oportunidades > 0));
        
        if (!acceso){
            System.out.println("No puedes acceder al area restringida");
        }
    }
    
}
