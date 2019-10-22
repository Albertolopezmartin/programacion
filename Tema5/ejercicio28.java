//Alberto López Martín 1º DAW
public class ejercicio28 {
  public static void main (String[] args) {
    int numIntro;
    int factor;
    factor = 1;
    
    System.out.println("Este programa te hace el factorial del numero que introduzcas");
    
    System.out.println("Escribe aqui el numero");
    numIntro = Integer.parseInt(System.console().readLine());
    
    for(int i = 1; i <=numIntro; i++) {
      factor = i*factor;
    }
    System.out.println("El factorial de tu numero es : " + factor);
  }
}
