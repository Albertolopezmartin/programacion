//Alberto López Martín 1ºDAW
public class ejercicio03 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    
    System.out.println("Este programa te pide que introduzcas 10 numeros y despues te los imprime del reves");
    
    for(int i = 0; i<10; i++){
      System.out.println("Introduce el dato "+ (i+1));
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("-----------------");
    
    for (int i = 9; i>=0; i--){
      System.out.println("El dato " + (i+1) +" es: "+ num[i]);
    }
    
  }
}
