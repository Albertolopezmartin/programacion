//Alberto López Martín 1º DAW
public class ejercicio33 {
  public static void main (String[] args) {
    int altura;
    int i;
    
    System.out.println("Este programa pinta una U de la altura que le digas");
    
    System.out.println("Introduce la altura");
    altura = Integer.parseInt(System.console().readLine());
    
    for (i = 0; i< altura-1; i++){
      System.out.print("*");
      for (int j = 0; j< (altura-2); j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for (i = 0; i<(altura-1); i+=2){
      System.out.print("* ");
    }
  }
}
