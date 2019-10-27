//Alberto López Martín 1º DAW
public class ejercicio35 {
  public static void main (String[] args) {
    int altura;
    
    System.out.println("Este programa pinta una X de la altura que le digas, mientras que esta sea impar o mayor o igual que 3.");
    
     do {
      System.out.print("Introduzca la altura:");
      altura = Integer.parseInt(System.console().readLine());
      if (!((altura >=3) && (altura % 2 == 1))){
        System.out.print("No es valida;la altura debe ser impar y mayor o igual que 3.");
      }
    } while (!((altura >=3) && (altura % 2 == 1))); 
    
    System.out.println("-----------");
    
    
    for (int fil = 1; fil <= altura; fil++){
      for (int col = 1; col <= altura; col++){
        if ((fil == col) || (col == (altura-fil)+1)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

