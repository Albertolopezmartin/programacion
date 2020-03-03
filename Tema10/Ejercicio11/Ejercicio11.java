/**
 *
 * @author Alberto López Martín
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner s = new Scanner(System.in);
        String palabraIntro;
        int numero;
        
        System.out.println("Este es un diccionario de español a inglés");
        
        diccionario.put("Hola", "Hello");
        diccionario.put("Mesa", "Table");
        diccionario.put("Ordenador", "Computer");
        diccionario.put("Silla", "Chair");
        diccionario.put("Puerta", "Door");
        diccionario.put("Coche", "Car");
        diccionario.put("Ventana", "Window");
        diccionario.put("Adiós", "Goodbye");
        diccionario.put("Novio", "Boyfriend");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Enemigo", "Enemy");
        diccionario.put("Mochila", "Bag");
        diccionario.put("Espada", "Sword");
        diccionario.put("Bastón", "Staff");
        diccionario.put("Magia", "Magic");
        diccionario.put("Fuerza", "Strength");
        diccionario.put("Llave", "Key");
        diccionario.put("Frío", "Cold");
        diccionario.put("Calor", "Hot");
        diccionario.put("Luz", "Light");
        
        String[] palabra = diccionario.keySet().toArray(new String[0]);
        
        
        
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add((int)(Math.random()*22));
        
        for (int i = 0; i < 5; i++) {
            do {
                numero = (int)(Math.random()*22);
            } while (n.contains(numero));
            n.add(numero);
        }
        
        int puntuacion = 0;
        
        System.out.println("Introduce la palabra que yo ponga en Español traducida al Inglés");
        for (int i = 0; i < 5; i++){
            System.out.print(palabra[n.get(i)]+ " : ");
            palabraIntro = s.nextLine();
            if (palabraIntro.equals(diccionario.get(palabra[n.get(i)]))){
                System.out.println("¡Correcto!");
                puntuacion++;
            } else {
                System.out.println("No es correcto");
            }
        }
        System.out.println("Has acertado "+ puntuacion + " veces");  
    }
}
