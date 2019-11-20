//Alberto López Martín 1ºDAW
public class ejercicio20 {
  public static void main (String[] args) {
    String [] numReyes;
    int totalReyes;
    String nombreRey;
    
    System.out.print("Introduzca el número total de nombres de reyes: ");
    totalReyes = Integer.parseInt(System.console().readLine());
    numReyes = new String [totalReyes];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    
    for (int i = 0; i<totalReyes;i++){
      nombreRey = System.console().readLine();
      numReyes[i] = nombreRey;
    }
    
    System.out.println();
    System.out.println("Los reyes introducidos son");
    
    for (int i = 0; i<totalReyes;i++){
      int orden = 1;
      
      for (int j = 0; j<i;j++){
        if (numReyes[i].equals(numReyes[j])){
          orden++;
        }
      }
      System.out.println(numReyes[i]+ " "+ orden+"º");
    }
    
  }
}
