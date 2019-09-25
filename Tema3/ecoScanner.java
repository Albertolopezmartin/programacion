import java.util.Scanner;

public class ecoScanner {
  public static void main (String[] args) {
    Scanner x = new Scanner(System.in);
    String captura;
    
    System.out.println("Este programa repite la primera palabra que escribas. Escribe ahora :");
    captura = x.next();
    System.out.println(captura);
    x.nextLine();
    
    System.out.println("Este programa repite la primera linea que escribas. Escribe ahora :");
    captura = x.nextLine();
    System.out.println(captura);
    
  }
  
  
  
}
