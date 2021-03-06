/**
 *
 * @author Alberto López Martín
 */

import java.util.Objects;

public class Carta implements Comparable<Carta>{
    private static Integer[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private static String[] p = {"bastos", "copas", "espadas", "oros"};
    private Integer numero;
    private String palo;
    
    
    public Carta(){
        this.numero = (int)(Math.random()*12);
        this.palo = p[(int)(Math.random()*4)];
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getPalo(){
        return palo;
    }
    
    @Override
    public String toString(){
        return this.numero + " de " + this.palo;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Carta c) {
      if (numero==c.numero){
        return palo.compareTo(c.getPalo());
      } else {
        return numero.compareTo(c.getNumero());
      }
    }
}
