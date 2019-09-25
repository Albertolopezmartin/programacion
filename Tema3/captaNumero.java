public class captaNumero {
  public static void main (String[] args) {
    //String captura;
    int dato;
    
    System.out.println("Este programa captura un entero. Introduce un numero: ");
    /*
    captura = System.console().readLine();
    dato = Integer.parseInt(captura);
    */
    
    dato = Integer.parseInt(System.console().readLine());
    System.out.println(dato);
    dato++;
    System.out.print(dato);
  }
  
}
