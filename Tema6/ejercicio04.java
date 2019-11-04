//Alberto López Martín 1ºDAW
public class ejercicio04 {
  public static void main (String[] args) {
    int num;
    
    System.out.println("Este programa muestra 20 numeros aleatorios entre 0 y 10 separados por espacios");
    
    for (int i = 0; i<20; i++){
      num = (int) ((Math.random()*11)+1)-1;
      System.out.print(num);
      System.out.print(" ");
    }
  }
}
