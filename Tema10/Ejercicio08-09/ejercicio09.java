/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;
import java.util.Collections;


public class ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<Carta>();
        Carta cartaAux = new Carta();

        int cuantas = (int)(Math.random()*11)+10;

        c.add(cartaAux);
        for (int i = 0; i < cuantas; i++) {
          do {
            cartaAux = new Carta();
          } while (c.contains(cartaAux));

          c.add(cartaAux);
        }

        Collections.sort(c);
        for (Carta miCarta: c){
          System.out.println(miCarta);
        }
    }
    
}
