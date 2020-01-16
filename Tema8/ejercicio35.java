//Alberto López Martín 1ºDAW

public class ejercicio35 {
  public static void main(String[] args) {
    
    int [] numeros = {470213, 0, 11, 24, 867024};
    
    for (int numero : numeros){
      System.out.println("El " + numero + " es el " + convierteEnPalotes(numero)+" en el sistema de palotes");
    }
  }
  public static String convierteEnPalotes (int a) {
    String resultado = "";
    int digito;
    a = (a>0)?a:-a;
    while (a > 0) {
      digito = a % 10;
      a = a /10;
      for (int i = 0; i <digito;i++){
        resultado = "|" + resultado;
      }
      if (a>0) {
        resultado = "-" + resultado;
      }
    }
    return resultado;
  }
}
