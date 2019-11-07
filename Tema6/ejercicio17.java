//Alberto López Martín 1ºDAW
public class ejercicio17 {
  public static void main (String[] args) {
    int altura;
    int anchura;
    int posicion;
    int pez;
    
    posicion = 0;
    
    System.out.println("Este programa pinta una pecera de la altura y la anchura que le digas, y con un pez que estara en una posicion aleatoria dentro de ella");
    do {
      System.out.print("Introduce la altura de la pecera (minimo 4): ");
      altura = Integer.parseInt(System.console().readLine());
      if (altura<4){
        System.out.print("Valor incorrecto. ");
      }
    } while (altura<4);
    
    
    
    do {
      System.out.print("Introduce la anchura de la pecera (minimo 4): ");
      anchura = Integer.parseInt(System.console().readLine());
      if (anchura<4){
        System.out.print("Valor incorrecto. ");
      }
    } while (anchura<4);
    
    for (int i = 1; i<=anchura; i++){
      System.out.print("*");
    }
    
    pez = (int)(Math.random()*(altura - 2)*(anchura - 2));
    
    for (int i = 2; i < altura; i ++) {
      System.out.print("\n*");
      for (int espacios = 2; espacios < anchura; espacios++) {
        if (posicion == pez){
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
      }
      System.out.print("*");
    }
    System.out.println();
    
    for (int i = 1; i<=anchura; i++){
      System.out.print("*");
    }
    System.out.println();
  }
}
