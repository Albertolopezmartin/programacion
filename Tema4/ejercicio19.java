//Alberto López Martín 1º DAW
public class ejercicio19 {
  public static void main (String[] args) {
    int numero;
    System.out.println("Este programa te dice cuantas cifra de un numero(de max 5 cifras) que escribas");
    
    System.out.println("Escribe aqui tu numero");
    
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero<10) {
      System.out.println("Tu numero tiene una cifra");
    }
    
    if (numero>=10 && numero<100) {
      System.out.println("Tu numero tiene dos cifras");
    }
    
    if (numero>=100 && numero<1000) {
      System.out.println("Tu numero tiene tres cifras");
    }
    
    if (numero>=1000 && numero<10000) {
      System.out.println("Tu numero tiene cuatro cifras");
    }
    
    if (numero>=10000 && numero<100000) {
      System.out.println("Tu numero tiene cinco cifras");
    }
  }
}
