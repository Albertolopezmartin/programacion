/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;

public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int longitud = (int)(Math.random() * 11 + 10);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < longitud; i++){
            numeros.add((int)(Math.random()*101));
        }
        
        System.out.println("Lista generada: " +numeros);
        
        for (int numero : numeros){
            suma += numero;
            
            if (numero < minimo){
                minimo = numero;
            }
            
            if (numero > maximo){
                maximo = numero;
            }
        }
        
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + suma/longitud);
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);
    }
    
}
