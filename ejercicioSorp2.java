//Alberto López Martín 1º DAW
public class ejercicioSorp2 {
  public static void main (String[] args) {
    int altura;
    String caracter;
    int numVeces;
    int hParte1;
    int hParte2;
    
    do {
      System.out.print("Introduzca la altura inicial:");
      altura = Integer.parseInt(System.console().readLine());
      if (!((altura >=3) && (altura % 2 == 1))){
        System.out.print("No es valido; debe ser impar y mayor o igual que 3.");
      }
    } while (!((altura >=3) && (altura % 2 == 1))); 
    
    System.out.print("Introduzca el caracter a dibujar: ");
    caracter = System.console().readLine();
    
    System.out.print("Introduzca el numero de veces que desea dibujar el reloj: ");
    numVeces = Integer.parseInt(System.console().readLine());
    
    
    
    //dibujo de la piramide invertida hacia abajo
    
    
    for (int vez=0; vez<numVeces; vez++){
      System.out.println();
      hParte1 = (altura+1) /2;
      int anchuraLinea = hParte1*2-1;
      for (int i=0; i<hParte1; i++){
        //pinto espacios en blanco
        for (int j=0; j<i; j++){
          System.out.print(" ");
        }
        // pinto relleno
        for (int j=0; j<anchuraLinea; j++) {
          System.out.print(caracter);
        }
        System.out.println();
        anchuraLinea-= 2;
      }
      
      //dibujo de la piramide hacia arriba
      hParte2 = hParte1-1;
      anchuraLinea = 3;
      for (int i=hParte2-1; i>=0; i--){
        //pinto espacios en blanco
        for (int j=0; j<i; j++){
          System.out.print(" ");
        }
        // pinto relleno
        for (int j=0; j<anchuraLinea; j++) {
          System.out.print(caracter);
        }
        System.out.println();
        anchuraLinea+= 2;
      }
    }
  }
}
