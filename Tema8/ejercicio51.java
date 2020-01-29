//Alberto López Martín 1ºDAW
import matematicas.Varias;
import arrays.arraysuni;

public class ejercicio51 {
  public static void main(String[] args) {
    int[] a = arraysuni.generaArrayInt(10, 2, 100);
    
    System.out.println("Array generado:");
    arraysuni.muestraArrayInt(a);
    
    System.out.println();
    
    for(int n : a){
      if (Varias.esPrimo(n)){
        System.out.print("El " + n + " es primo");
      } else {
        System.out.print("El " + n + " no es primo");
      }
      
      if (Varias.esCapicua(n)){
        System.out.println(" y es capicúo");
      } else {
        System.out.println(" , no es capicúo");
      }
    }
  }
}
