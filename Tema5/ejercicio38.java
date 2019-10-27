//Alberto López Martín 1º DAW
public class ejercicio38 {
  public static void main (String[] args) {
    int altura;
    
    int hParte1;
    int hParte2;
    
    System.out.println("Este programa pinta un reloj de arena de la altura que le digas siempre que esta sea superior o igual que 3 e impar");
    
    do {
      System.out.print("Introduzca la altura:");
      altura = Integer.parseInt(System.console().readLine());
      if (!((altura >=3) && (altura % 2 == 1))){
        System.out.print("No es valido; debe ser impar y mayor o igual que 3.");
      }
    } while (!((altura >=3) && (altura % 2 == 1))); 
    
    System.out.println("-----------------");
    
    hParte1 = (altura+1) /2;
    int anchuraLinea = hParte1*2-1;
    for (int i=0; i<hParte1; i++){
      for (int j=0; j<i; j++){
        System.out.print(" ");
      }
      for (int j=0; j<anchuraLinea; j++) {
        System.out.print("*");
      }
      System.out.println();
      anchuraLinea-= 2;
    }
    
    hParte2 = hParte1-1;
    anchuraLinea = 3;
    for (int i=hParte2-1; i>=0; i--){
      for (int j=0; j<i; j++){
        System.out.print(" ");
      }
      for (int j=0; j<anchuraLinea; j++) {
        System.out.print("*");
      }
      System.out.println();
      anchuraLinea+= 2;
    }
  }
}

