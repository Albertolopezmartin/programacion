//Alberto López Martín 1ºDAW
public class ejercicio06 {
  public static void main (String[] args) {
    int [] num;
    num = new int [15];
    int aux;
    
    System.out.println("Este programa te pide numeros y despues los imprime desplazados un numero y el ultimo que escribas se imprime el primero");
    
    for(int i = 0; i<15; i++){
      System.out.println("Introduce el dato "+ (i+1));
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    aux = num[14];
    for(int i = 14; i>0; i--){
      num[i] = num[i-1];
    }
    
    num [0] = aux;
    System.out.println("---------------");
    
    for(int i = 0; i<15; i++){
      System.out.println(num[i]);
    }
    
  }
}
