//Alberto López Martín 1ºDAW
public class ejercicio05 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("Este programa te pide que introduzcas 10 numeros y despues te los imprime y te dice cual ha sido el maximo y minimo que has introducido");
    
    for(int i = 0; i<10; i++){
      System.out.println("Introduce el dato "+ (i+1));
      num[i] = Integer.parseInt(System.console().readLine());
      if (num[i] < minimo) {
        minimo = num[i];
      }
      
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    
    System.out.println("-------");
    
    for (int i = 0; i<10; i++){
      if (num[i] == maximo) {
        System.out.println("Este es el numero maximo que has escrito");
      }
      if (num[i] == minimo) {
        System.out.println("Este es el numero minimo que has escrito");
      }
      System.out.println("El dato " + (i+1) +" es: "+ num[i]);
      
    }
    
    
  }
}
