//Alberto López Martín 1º DAW
public class ejercicio29 {
  public static void main (String[] args) {
    int numIntro1;
    int numIntro2;
    
    System.out.println("Este programa te da los numeros menores de un numero que introduzcas que no sean divisibles de otro numero que introduzcas");
    
    System.out.println("Introduce el numero que quieras del que salgan los menores a mostrar");
    numIntro1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el numero del que no salgan los divisores");
    numIntro2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("--------------");
    
    for (int i = 1; i <numIntro1; i++) {
      if ((i % numIntro2) != 0) {
        System.out.println(i);
      }
    }
  }
}
