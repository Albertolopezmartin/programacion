/**
 *
 * @author Alberto López Martín
 */

import java.util.HashMap;
import java.util.ArrayList;


public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carta> c = new ArrayList<>();
        HashMap<String, Integer> h = new HashMap<>();
        int puntos = 0;
        
        h.put("as", 11);
        h.put("2", 0);
        h.put("3", 10);
        h.put("4", 0);
        h.put("5", 0);
        h.put("6", 0);
        h.put("7", 0);
        h.put("sota", 2);
        h.put("caballo", 3);
        h.put("rey", 4);
        
        Carta cartaAux = new Carta();
        c.add(cartaAux);
        
        for (int i =0; i < 5; i++){
            do {
                cartaAux = new Carta();
            } while (c.contains(cartaAux));
            c.add(cartaAux);
        }
        
        for (Carta miCarta : c){
            System.out.println(miCarta);
            puntos += h.get(miCarta.getFigura());
        }
        
        System.out.println("Tienes "+ puntos + " puntos.");
    }
    
}
