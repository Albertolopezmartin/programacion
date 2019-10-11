//Alberto López Martín 1º DAW
public class ejercicio11 {
  public static void main (String[] args) {
    int numIntro;
    
    System.out.println("Este programa te da el cuadrado y el cubo de los 5 numeros siguientes del que introduzcas");
    
    System.out.println("Introduce aqui tu numero");
    
    numIntro = Integer.parseInt(System.console().readLine());
    
    for (int i = numIntro ; (i < numIntro + 5) ; i++ ) {
      System.out.printf ("%4d %6d  %8d\n", i, (i * i), (i * i * i));
    }
  }
}
