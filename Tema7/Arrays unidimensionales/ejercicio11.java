//Alberto López Martín 1ºDAW
public class ejercicio11 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    
    System.out.println("Introduce 10 numeros, despues se mostraran los numeros que has introducidos y a continuación pasara los numeros primos al principio");
    
    for(int i = 0; i<10; i++){
      System.out.print("Introduce el "+(i+1)+" : ");
      num [i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    System.out.println("Los numeros que has introducido en orden son :");
    for(int i = 0; i<10; i++){
      System.out.print (num[i] + " ");
    }
    
    System.out.println();
    System.out.println("Los numeros que has introducido cons los primos movidos al principio son");
    
  }
}
