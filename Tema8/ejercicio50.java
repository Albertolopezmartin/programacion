//Alberto López Martín 1ºDAW

public class ejercicio50 {
  public static void main(String[] args) {
    int [] a = {8,9,0};
    int [] b = {1,2,3};
    
    for (int n : mezcla(a, b)){
      System.out.print(n + " ");
    }
    System.out.println();
    
    int[] c = {4,3};
    int[] d = {7,8,9,10};
    
    for (int n : mezcla(c, d)){
      System.out.print(n + " ");
    }
  }
  public static int[] mezcla(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];
    
    int colocadosDeA = 0;
    int colocadosDeB = 0;
    int i = 0;
    
    do{
      if (colocadosDeA < a.length){
        resultado[i++] = a[colocadosDeA++];
      }
      
      if (colocadosDeB <b.length){
        resultado[i++] = b[colocadosDeB++];
      }
    } while (i < a.length + b.length);
    
    return resultado;
  }
}
