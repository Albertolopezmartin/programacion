/**
 *
 * @author Alberto López Martín
 */
public class Moneda {
    private static String posiciones [] = {"cara","cruz"};
    private static String cantidades [] = {"1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos", "1 euro", "2 euros"};
    private String posicion;
    private String cantidad;
    
    public Moneda (){
        this.posicion = posiciones[(int)(Math.random()*2)];
        this.cantidad = cantidades[(int)(Math.random()*8)];
    }
    
    public String getPosicion(){
        return this.posicion;
    }
    
    public String getCantidad(){
        return this.cantidad;
    }
    
    @Override
    public String toString(){
        return this.cantidad + "-" + this.posicion;
    }
}
