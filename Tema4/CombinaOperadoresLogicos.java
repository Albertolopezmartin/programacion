public class CombinaOperadoresLogicos{
  public static void main (String[] args) {
    int valorRecogido1, valorRecogido2;
    int resto1, resto2;
    
    System.out.print ("Intduzca el primer entero: ");
    valorRecogido1 = Integer.parseInt(System.console().readLine());
    
    System.out.print ("Intduzca el segundo entero: ");
    valorRecogido2 = Integer.parseInt(System.console().readLine());
    
    resto1 = valorRecogido1 % 2;
    resto2 = valorRecogido2 % 2;
    
    if ((resto1 == 0) && (resto2 == 0)) {
      System.out.println ("Los dos numeros son PARES");
    } else {
      System.out.println ("Los dos numeros NO son PARES");
    }
    
  }
  
}
