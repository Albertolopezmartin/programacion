import java.util.Scanner;

public class captaNumeroScanner {
  public static void main (String[] args) {
    Scanner x = new Scanner(System.in);
    
    int dato;
    
    System.out.println("Este programa captura un entero. Introduce un numero: ");
    
    dato = x.nextInt();
    System.out.println(dato);
    dato++;
    System.out.print(dato);
  }
  
}
