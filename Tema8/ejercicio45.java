//Alberto López Martín 1ºDAW

public class ejercicio45 {
  public static void main(String[] args) {
    int altura = 0;
    
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < altura; i++) {
      System.out.print(linea('*', i));
      System.out.print(linea(' ', altura * 2 - i * 2 - 1));
      System.out.println(linea('*', i));
    }
    System.out.println(linea('*', altura * 2 - 1));
    
  }
  public static String linea(char caracter, int altura){
    String resultado ="";
    for (int i = 0; i < altura; i++) {
      resultado += caracter;
    }
    return resultado;
  }
}
