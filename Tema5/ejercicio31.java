//Alberto López Martín 1º DAW
public class ejercicio31 {
  public static void main (String[] args) {
    int altura;
    
    System.out.println("Este programa pinta una L de la altura que le digas");
    
    System.out.println("Introduce la altura");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("-------------------");
    
    for (int i = 0; i<(altura-1); i++){
      System.out.println("*");
    }
    for (int i = 0; i<((altura/2)+1); i++){
      System.out.print("* ");
    }
  }
}
