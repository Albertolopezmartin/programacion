public class ejercicio17 {
  public static void main (String[] args) {
    int numero;
    
    System.out.println("Este programa te dice la ultima cifra del numero que escribas");
    
    System.out.println("Escribe aqui tu numero");
    
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("La ultima cifra de tu numero es: " + (numero % 10));
  }
}
