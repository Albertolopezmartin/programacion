/**
 *
 * @author Alberto López Martín
 */

import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner s = new Scanner(System.in);
        String palabraIntro;
        
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
        
        System.out.println("Introduce la palabra en Español");
        palabraIntro = s.nextLine();
        
        if (diccionario.containsKey(palabraIntro)){
            System.out.println(palabraIntro + " traducida al inglés es: "+ diccionario.get(palabraIntro));
        } else {
            System.out.println("No conozco esa palabra");
        }
    }
    
}
