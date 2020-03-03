/**
 *
 * @author Alberto López Martín
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Introduce 10 palabras para sean ordenados de menor a mayor");
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Intruduce una de las palabras: ");
            palabras.add(s.nextLine());
        }
        
        System.out.println("Estos son tus palabras sin ordenar: "+ palabras);
        
        Collections.sort(palabras);
        
        System.out.println("Estos son tus palabras ordenados: "+ palabras);
    }
    
}
