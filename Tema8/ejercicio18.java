//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio18 {
  public static void main (String[] args) {
    int decimal;
    
    System.out.print("Introduce un numero en decimal: ");
    decimal = Integer.parseInt(System.console().readLine());
    
    System.out.println(decimal+ " este numero decimal es "+ decimalABinario(decimal)+ " en binario");
    
  }
  public static long decimalABinario(int decimal) {
    
    if (decimal == 0){
      return 0;
    }
    
    long binario = 1;
    
    while (decimal>1) {
      binario = Varias.pegaPorDetras(binario,decimal % 2);
      decimal = decimal/2;
    }
    
    binario = Varias.pegaPorDetras(binario, 1);
    binario = Varias.voltea(binario);
    binario = Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
}
