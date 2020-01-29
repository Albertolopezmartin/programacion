//Alberto López Martín 1ºDAW

public class ejercicio48 {
  public static void main(String[] args) {
    int [] a = {1,5,8,6};
    int [] b = {2,7,9,3};
    
    for (int e : concatena(a,b)){
      System.out.print(e+ " ");
    }
  }
  public static int[] concatena(int[] a, int[] b) {
    int [] resultado = new int[a.length +b.length];
    
    for (int i = 0; i < a.length; i++){
      resultado[i] = a[i];
    }
    
    for (int i = 0; i< b.length;i++){
      resultado[i+a.length]=b[i];
    }
    
    return resultado;
  }
}
