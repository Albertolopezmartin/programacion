//Alberto López Martín 1º DAW
public class ejercicio06 {
  public static void main (String[] args) {
    System.out.println ("Este programa imprime los numeros que hay entre el 320 y el 160 de 20 en 20");
    int i = 320;
    
    do {
      System.out.println (i);
      i -= 20;
    } while (i>=160);
  }
}
