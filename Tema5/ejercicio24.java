//Alberto López Martín 1º DAW
public class ejercicio24 {
  public static void main (String[] args) {
    int alturaIntro;
    int altura;
    int espacio;
    int i;
    i = 0;
    altura = 1;
    
    System.out.println("Este programa imprime una piramide hecha con numeros, el numero de filas es determinado por el numero que introduzcas");
    
    System.out.println("Introduce aqui la altura");
    alturaIntro = Integer.parseInt(System.console().readLine());
    espacio = alturaIntro -1;
    
    while (altura<=alturaIntro) {
      
      for (i=1; i<=espacio; i++) {
        System.out.print(" ");
      }
      
      for (i=1; i< altura; i++) {
        System.out.print(i);
      }
      
      for (i=altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacio--;
      
    }
  }
}
