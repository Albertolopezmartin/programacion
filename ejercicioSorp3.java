//Alberto López Martín 1º DAW
public class ejercicioSorp3 {
  public static void main (String[] args) {
    int altura;
    int numPir;
    int masAltura;
    String caracter;
    String dir;
    
    System.out.println("Este programa pinta cuantas piramides que indiques, de una altura inicial, el incremento de la altura, con el caracter que indiques y si apunta hacia arriba o abajo.");
    
    System.out.println("Introduzca la altura");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el incremento de altura");
    masAltura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el caracter");
    caracter = System.console().readLine();
    
    System.out.println("Introduzca la direccion de la piramide (arriba o abajo)");
    dir = System.console().readLine();
    
    System.out.println("Introduzca el numero de piramides");
    numPir = Integer.parseInt(System.console().readLine());
    
    System.out.println("----------------------");
    if (dir.equals("arriba")){
      for (int pir = 0; pir < numPir; ++pir){
        for (int i = 0; i < altura; i++){
          for (int rell = 0; rell < altura-i-1; rell++){
            System.out.print(" ");
          }
          for (int on = 0; on < 2*i+1; on++){
            System.out.print(caracter);
          }
          System.out.println();
        }
        altura = altura+masAltura;
      }
    }
    if (dir.equals("abajo")){
      for (int pir = 0; pir < numPir; ++pir){
        int anchuraLinea = altura*2-1;
        
        for (int i=0; i<altura; i++){
          for (int j=0; j<i; j++){
            System.out.print(" ");
          }
          for (int j=0; j<anchuraLinea; j++) {
            System.out.print(caracter);
          }
          System.out.println();
          anchuraLinea-= 2;
        }
        altura = altura+masAltura;
      }
    }
  }
}
