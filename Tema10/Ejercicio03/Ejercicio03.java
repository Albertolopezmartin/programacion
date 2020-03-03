/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce 10 numeros para sean ordenados de menor a mayor");
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Intruduce uno de los numeros: ");
            numeros.add(s.nextInt());
        }
        
        System.out.println("Estos son tus numeros sin ordenar: "+ numeros );
        
        Collections.sort(numeros);
        
        System.out.println("Estos son tus numeros ordenados: "+ numeros);
    }
    
}
