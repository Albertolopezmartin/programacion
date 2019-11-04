//Alberto López Martín 1ºDAW
public class ejercicio06 {
  public static void main (String[] args) {
    int num;
    int numIntro;
    int oportunidades;
    boolean acertado = false;
    
    oportunidades = 5;
    
    num = (int) (Math.random()*101);
    System.out.println("He pensado un numero del 0 al 100, tienes 5 intentos para adivinarlo");
    
    do {
      System.out.println("Escribe un numero");
      numIntro = Integer.parseInt(System.console().readLine());
      oportunidades --;
      if (numIntro<num){
        System.out.println("Incorrecto! El numero que has introducido es menor que el numero que he pensado");
        System.out.println("Te quedan "+ oportunidades+ " intentos");
      } else {
        if (numIntro>num){
          System.out.println("Incorrecto! El numero que has introducido es mayor que el numero que he pensado");
          System.out.println("Te quedan "+ oportunidades+ " intentos");
        } else {
          System.out.println("Has acertado!");
          acertado = true;
        }
      }
    } while (!acertado && (oportunidades>0));
    
    if (!acertado) {
      System.out.println("Lo siento, te has quedado sin intentos");
    }
      
  }
}
