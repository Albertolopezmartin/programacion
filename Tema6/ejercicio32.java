//Alberto López Martín 1ºDAW
public class ejercicio32 {
  public static void main (String[] args) {
    int longitud;
    int hayObstaculo;
    int queObstaculo;
    int variacion;
    int espacios;
    
    espacios = 6;
    
    System.out.print("Escribe la longitud del camino: ");
    
    longitud = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i<longitud; i++){
      for(int j = 0; j<espacios; j++){
        System.out.print(" ");
      }
      
      System.out.print("|");
      hayObstaculo = (int) (Math.random()*11);
      queObstaculo = (int) (Math.random()*2);
      for (int j = 0; j<5; j++){
        if (j==hayObstaculo){
          if (queObstaculo==0){
            System.out.print("*");
          } else {
            System.out.print("O");
          }
        } else {
          System.out.print(" ");
        }
      }
      
      System.out.print("|");
      System.out.println();
      do{
        espacios = (int) (Math.random()*8);
      } while (espacios<5);
    }
    
  }
}
