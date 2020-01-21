//Alberto López Martín 1ºDAW

public class ejercicio42 {
  public static void main(String[] args) {
    int altura = 0;
    
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.println(linea('*', altura));
    
    for (int i = 1; i < altura; i++) {
      System.out.print("*" + linea(' ', altura - i - 2));
      if (i < altura - 1) {
        System.out.println("*");
      }
    }
    System.out.println();
  }
  public static String linea(char caracter, int altura){
    String resultado ="";
    for (int i = 0; i < altura; i++) {
      resultado += caracter;
    }
    return resultado;
  }
}
