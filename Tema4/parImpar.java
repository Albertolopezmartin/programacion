public class parImpar {
  public static void main (String[] args) {
    int valorRecogido;
    int resto;
    
    System.out.print ("Intduzca un entero: ");
    valorRecogido = Integer.parseInt(System.console().readLine());
    
    resto = valorRecogido % 2;
    
    if (resto == 0) {
      System.out.println ("El numero introducido es PAR");
    } else {
      System.out.println ("El numero introducido es IMPAR");
    }
    
  }
}
