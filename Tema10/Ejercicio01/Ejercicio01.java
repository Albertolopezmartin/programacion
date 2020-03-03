/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> companeros = new ArrayList<String>();
       
       companeros.add("Javier");
       companeros.add("Teresa");
       companeros.add("Pablo");
       companeros.add("Luque");
       companeros.add("Juan");
       companeros.add("Silvia");
       
       for (String companero : companeros){
           System.out.println(companero);
       }
    }
    
}
