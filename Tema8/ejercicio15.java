//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio15 {
  public static void main (String[] args) {
    int primo = 0;
    
    System.out.println("Muestra los numeros primos que hay entre 1 y el 1000");
    
    for(int i = 0; i <=1000; i++){
      if (matematicas.Varias.esPrimo(primo)) {
        System.out.printf("%5d",primo);
      }
      primo++;
    }
    
  }
}
