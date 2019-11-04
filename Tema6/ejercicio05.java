//Alberto López Martín 1ºDAW
public class ejercicio05 {
  public static void main (String[] args) {
    int num;
    int suma;
    int max;
    int min;
    
    suma = 0;
    max = 0;
    min = 199;
    
    System.out.println("Este programa muestra 50 numeros aleatorios entre 100 y 199 separados por espacios");
    
    for (int i = 0; i<50; i++){
      num = (int) (Math.random()*(199-100+1))+100;
      System.out.print(num);
      System.out.print(" ");
      suma = suma + num;
      if (max<num){
        max = num;
      }
      if (min>num){
        min = num;
      }
    }
    System.out.println();
    System.out.println("El minimo de los numeros que han salido es: " +min);
    System.out.println("El maximo de los numeros que han salido es: " +max);
    System.out.println("La media de los numeros que han salido es: "+ (suma/50));
    
  }
}
