public class ejercicio08 {
  public static void main (String[] args) {
    int numero;
    
    System.out.println("Este programa te da la tabla de multiplicar del numero que introduzcas");
    System.out.println ("Introduzce el numero que quieras multiplicar");
      numero = Integer.parseInt(System.console().readLine());
    System.out.println ("------------------------------------------");
    for (int i = 1; i <= 10; i ++ ) {
      System.out.println (numero*i);
    }
  }
}
