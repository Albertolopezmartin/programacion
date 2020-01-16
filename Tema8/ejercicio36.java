//Alberto López Martín 1ºDAW
import matematicas.Varias;
import arrays.arraysuni;

public class ejercicio36 {
  public static void main(String[] args) {
    int[] numeros = arrays.arraysuni.generaArrayInt(20, 1, 100);
    
    System.out.println("Array original:");
    arrays.arraysuni.muestraArrayInt(numeros);
    System.out.print("Primos: ");
    arrays.arraysuni.muestraArrayInt(filtraPrimos(numeros));
    
  }
  public static int[] filtraPrimos(int []x) {
    int [] primos = new int[x.length];
    
    int cuentaPrimos = 0;
    for (int numero : x){
      if (matematicas.Varias.esPrimo(numero)){
        primos[cuentaPrimos++] = numero;
      }
    }
    int [] resultado = new int[cuentaPrimos];
    
    for (int i = 0; i < cuentaPrimos; i++){
      resultado[i] = primos[i];
    }
    
    return resultado;
  }
}
