//Alberto López Martín 1ºDAW
public class ejercicio08 {
  public static void main (String[] args) {
    int [] temp;
    temp = new int [12];
    String [] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    
    
    System.out.println("Introduce la temperatura media de cada mes");
    
    for (int i = 0; i<12; i++){
      System.out.print("Introduce la temperatura media del "+mes [i] +" : ");
      temp [i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("------------------------------------------");
    
    for (int i = 0; i<12; i++){
      System.out.print("La temperatura media del "+mes [i]+" : ");
       for (int j = 0; j<temp[i];j++){
         System.out.print("*");
       }
       System.out.print(" " + temp[i]+ "ºC");
       System.out.println();
     }
  }
}
