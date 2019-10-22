//Alberto López Martín 1º DAW
public class ejercicio26 {
  public static void main (String[] args) {
    int numIntro;
    int digito;
    int posicion;
    int numero;
    int reves;
    int longitud;
    posicion = 1;
    longitud = 0;
    reves = 0;
    
    
    System.out.println("Este programa da la posicion de un digito que indiques de un numero que hayas indicado");
    
    System.out.println("Introduce aqui el numero");
    numIntro = Integer.parseInt(System.console().readLine());
    numero = numIntro;
    
    System.out.println("Introduce el digito que quieras saber la posición");
    digito = Integer.parseInt(System.console().readLine());
    
    System.out.println("La posicion del digito en tu numero es, empezando por la izquierda");
    
    while (numero > 0) {
      reves = (reves*10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    
    while (reves > 0) {
      if ((reves % 10) == digito) {
        System.out.print (posicion + " ");
      }
      reves /= 10;
      posicion++;
    }
    
    System.out.println("");
  }
}
