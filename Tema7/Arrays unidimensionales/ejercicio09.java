//Alberto López Martín 1ºDAW
public class ejercicio09 {
  public static void main (String[] args) {
    int [] num;
    num = new int [8];
    
    System.out.println("Introduce 8 numeros y despues el programa te dira si son pares o impares");
    
    for (int i = 0; i<8; i++){
      System.out.print("Introduce el numero "+ (i+1)+" : ");
      num [i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i<8; i++){
      System.out.print("El numero " +num[i]+ " es: ");
      if ((num [i] % 2) == 0) {
        System.out.println("par");
      } else {
        System.out.println("impar");
      }
    }
  }
}
