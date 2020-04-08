/**
 *
 * @author alber
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");
        
        Scanner s = new Scanner(System.in);
        
        String palabraIntro = "";
        
        do {
            System.out.println("\nIntroduzca una palabra y te dare los sinonimos: ");
            palabraIntro = s.nextLine();
            
            if (!palabraIntro.equals("salir")) {
                if (!diccionario.containsKey(palabraIntro)) {
                    System.out.print("No conozco esa palabra");
                } else if (!tieneSinonimos(palabraIntro, diccionario)) {
                    System.out.print("No conozco sinónimos de esa palabra");
                } else {
                    String significado = diccionario.get(palabraIntro);
                    System.out.print("Sinónimos de " + palabraIntro + ": ");
                    
                    ArrayList<String> sinonimos = new ArrayList<>();
                    
                    for (Map.Entry entrada : diccionario.entrySet()) {
                        if (!entrada.getKey().equals(palabraIntro) && entrada.getValue().equals(significado)) {
                            sinonimos.add((String) entrada.getKey());
                        }
                    }
                    muestraLista(sinonimos);
                }
            }
        } while (!palabraIntro.equals("salir"));
    }
    public static boolean tieneSinonimos(String palabra, HashMap<String, String> d) {
        String significado = d.get(palabra);
        
        int contador = 0;
        
        for (Map.Entry entrada : d.entrySet()) {
            if (entrada.getValue().equals(significado)) {
                contador++;
            }
        }
        return contador > 1;
    }
    public static void muestraLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() -1) {
                System.out.print(", ");
            }
        }
    }
}
