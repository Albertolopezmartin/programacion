//Alberto López Martín 1ºDAW
public class ejercicio18 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int [] menos100;
    menos100 = new int [10];
    int [] mas100;
    mas100 = new int [10];
    int cuentaMas = 0;
    int cuentaMenos = 0;
    int [] resultado;
    resultado = new int [10];
    int j;
    int masColocados = 0;
    int menosColocados = 0;
    
    
    System.out.print("Indice ");
    
    for (int i = 0; i<10; i++){
      System.out.print(i+ " ");
    }
    
    System.out.println();
    
    for (int i = 0; i<10; i++){
      num[i]= (int) (Math.random()*201);
      System.out.print(num[i]+ " ");
      
      if (num[i]<=100){
        menos100[cuentaMenos++] = num[i];
      } else {
        mas100[cuentaMas++] = num[i];
      }
    }
    
    j = 0;
    do {
      if (menosColocados<cuentaMenos) {
        resultado[j++] = menos100[menosColocados++];
      }
      
      if (masColocados<cuentaMas) {
        resultado[j++] = mas100[masColocados++];
      }
      
    } while (j < 10);
    
    
    System.out.println();
    
    System.out.print("Indice ");
    
    for (int i = 0; i<10; i++){
      System.out.print(i+ " ");
    }
    
    System.out.println();
    
    for (int i = 0; i<10; i++){
      System.out.print(resultado[i]+ " ");
    }
    
    
  }
}
