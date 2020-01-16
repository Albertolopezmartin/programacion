//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio37 {
  public static void main(String[] args) {
    int[] numeros = {213, 0, 11, 24, 86};
    
    for (int numero : numeros){
      System.out.println("El " + numero + " es el " + convierteEnMorse(numero)+ " en morse");
    }
    
  }
  public static String convierteEnMorse(int n){
    String[] morse = {
      "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
      ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
    };
    
    String resultado = "";
    
    for (int i = 0; i< matematicas.Varias.digitos(n); i++){
      resultado += morse[matematicas.Varias.digitoN(n, 1)];
    }
    
    return resultado;
  }
}
