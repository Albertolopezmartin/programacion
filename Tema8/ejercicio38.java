//Alberto López Martín 1ºDAW
import matematicas.Varias;
import arrays.arraysuni;

public class ejercicio38 {
  public static void main(String[] args) {
    int [] numeros = arrays.arraysuni.generaArrayInt(20, 1, 1000);
    
    System.out.println("Array original:");
    arrays.arraysuni.muestraArrayInt(numeros);
    
    System.out.println("Capicúas:");
    arrays.arraysuni.muestraArrayInt(filtraCapicuas(numeros));
  }
  public static int[] filtraCapicuas(int x[]){
    int [] capicuas = new int[x.length];
    int cuentaCapicuas = 0;
    
    for (int numero : x){
      if (matematicas.Varias.esCapicua(numero)){
        capicuas[cuentaCapicuas++] = numero;
      }
    }
    
    int [] resultado = new int[cuentaCapicuas];
    
    for (int i = 0; i < cuentaCapicuas; i++){
      resultado[i] = capicuas[i];
    }
    
    return resultado;
  }
}
