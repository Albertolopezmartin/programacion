//Alberto López Martín 1º DAW
public class ejercicio22 {
  public static void main (String[] args) {
    boolean primo = true;
    
    System.out.println ("Este programa muestra todos los numeros primos que hay entre 2 y 100.");
    
    for (int num = 2; num<= 100; num++){
      primo = true;
      if ((num%2) == 0){
        primo = false;
      }
      if (primo){
        System.out.println("" +num);
      }
    }
    System.out.println("-------");
  }
}
