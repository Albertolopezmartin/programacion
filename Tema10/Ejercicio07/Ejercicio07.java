/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;

public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<>();
        
        Moneda moneda = new Moneda();
        monedas.add(moneda);
        
        String ultimaPosicion = moneda.getPosicion();
        String ultimaCantidad = moneda.getCantidad();
        
        for (int i = 0; i < 5 ; i++){
            do {
                moneda = new Moneda();
            } while ((!((moneda.getPosicion()).equals(ultimaPosicion)) && !((moneda.getCantidad()).equals(ultimaCantidad))));
            
            monedas.add(moneda);
            ultimaPosicion = moneda.getPosicion();
            ultimaCantidad = moneda.getCantidad();
        }
        
        for (Moneda mon : monedas){
            System.out.println(mon);
        }
    }
    
}
