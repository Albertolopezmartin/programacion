public class ejercicio14 {
  public static void main (String[] args) {
    int numero;
    
    System.out.println("Este programa indica si el numero introducido es par/impar y si es divisible entre 5 o no");
    
    System.out.println("Introduzca el numero");
    
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero%2 == 0 && numero%5 == 0){
      System.out.println("Este numero es par y es divisible por 5");
    }
    if (numero%2 == 0 && numero%5 !=0){
      System.out.println("Este numero es par, pero no es divisible por 5");
    }
    if (numero%2 != 0 && numero%5 == 0){
      System.out.println("Este numero es impar y es divisible por 5");
    }
    if (numero%2 != 0 && numero%5 != 0){
      System.out.println("Este numero es impar, pero no es divisible por 5");
    }
  }
}
