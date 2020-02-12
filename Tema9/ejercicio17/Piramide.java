/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto López Martín
 */
public class Piramide {
    private int altura;
    private static int piramidesCreadas;
    
    public Piramide (int altura){
        this.altura = altura;
        piramidesCreadas++;
    }
    
    public static int getPiramidesCreadas(){
        return piramidesCreadas;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = altura - 1;
        
        while (planta <= altura) {

            for (int i = 1; i <= espacios; i++) {
                cadena += ' ';
            }

            for (int i = 1; i <= longitudDeLinea; i++) {
                cadena += '*';
            }
            cadena += '\n';
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
        return cadena;
    }
}
