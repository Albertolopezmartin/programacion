//Alberto López Martín 1ºDAW
import matematicas.Varias;
import arrays.arraysuni;

public class ejercicio40 {
  public static void main(String[] args) {
    int[] numeros = arrays.arraysuni.generaArrayInt(20,1,1000);
    
    System.out.println("Array original:");
    arrays.arraysuni.muestraArrayInt(numeros);
    
    System.out.println("Arrays que tienen al menos un 7:");
    arrays.arraysuni.muestraArrayInt(filtraCon7(numeros));
  }
  public static int[] filtraCon7(int x[]){
    int[] con7 = new int[x.length];
    
    int numerosCon7 = 0;
    for (int numero : x){
      if (contieneEl7(numero)){
        con7[numerosCon7++] = numero;
      }
    }
    
    int[] resultado = new int[numerosCon7];
    
    for (int i = 0; i<numerosCon7;i++){
      resultado[i]= con7[i];
    }
    
    return resultado;
  }
  
  public static boolean contieneEl7(int n){
    return matematicas.Varias.posicionDeDigito(n, 7) != -1;
  }
  
  public static boolean contieneEl7(long n){
    return matematicas.Varias.posicionDeDigito(n, 7) != -1;
  }
}
