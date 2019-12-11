//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio17 {
  public static void main (String[] args) {
    long decimal = 0;
    long binario;
    int bits;
    
    System.out.println("Escribe un numero binario");
    binario = Long.parseLong(System.console().readLine());
    
    bits = Varias.digitos(binario);
    
    for (int i = 0; i < bits; i++) {
      decimal += Varias.digitoN(binario, bits - i - 1)* Varias.potencia(2, i);
    }
    
    System.out.println(binario + " este numero binario es "+ decimal +" en decimal");
  }
}
