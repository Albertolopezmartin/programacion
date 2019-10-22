//Alberto López Martín 1º DAW
public class ejercicio25 {
  public static void main (String[] args) {
    int numIntro;
    int numero;
    int reves;
    
    reves = 0;
    
    System.out.println("Este programa le da la vuelta al numero que introduzcas");
    
    System.out.println("Introduce el numero");
    
    numIntro = Integer.parseInt(System.console().readLine());
    numero = numIntro;
    
    while (numero>0) {
      reves = (reves*10) + (numero % 10);
      numero /= 10;
    } 
    
    System.out.println("El numero " + numIntro + " puesto del reves es : " + reves);
    
  }
}
