//Alberto López Martín 1ºDAW

public class ejercicio41 {
  public static void main(String[] args) {
    int altura = 0;
    
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = altura; i >0; i--){
      System.out.println(linea('*', i));
    }
  }
  public static String linea(char caracter, int altura){
    String resultado ="";
    for (int i = 0; i < altura; i++) {
      resultado += caracter;
    }
    return resultado;
  }
}
