//Alberto López Martín 1º DAW
public class ejercicio18 {
  public static void main (String[] args) {
    int num1;
    int num2;
    
    System.out.println("Este programa te da los numeros que hay entre dos numeros que introduzcas en incrementos de 7 en 7");
    do {
      System.out.println("Introduce el primer numero");
      num1 = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el segundo numero");
      num2 = Integer.parseInt(System.console().readLine());
      
      if (num1 == num2){
        System.out.println("los numeros tienen que ser distintos");
      }
    } while (num1 == num2);
    
    
    if (num1<num2){
      do {
        System.out.println (""+num1);
        num1+=7;
      } while (num1<num2);
    }
    
    if (num2<num1){
      do {
        System.out.println (""+num2);
        num2+=7;
      } while (num2<num1);
    }
  }
}
