//Alberto López Martín 1º DAW
public class ejercicio07 {
  public static void main (String[] args) {
    int contraseña;
    int i;
    i = 0;
    
    System.out.println ("Intenta adivinar la combinación de una caja fuerte de 4 cifras, tienes 4 intentos");
    do {
      System.out.println (" Introduce el numero de la combinación:");
      contraseña = Integer.parseInt(System.console().readLine());
      
      if (contraseña==4795) {
        System.out.println ("Enhorabuena! has acertado");
        i = 4;
      } else {
        System.out.println("Error! Intentalo de nuevo");
      }
      i++;
    } while (i<=3);
  }
}
