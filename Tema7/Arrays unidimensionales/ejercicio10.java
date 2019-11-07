//Alberto López Martín 1ºDAW
public class ejercicio10 {
  public static void main (String[] args) {
    int [] num;
    num = new int [20];
    int [] par;
    par = new int [20];
    int [] impar;
    impar = new int [20];
    
    System.out.println("Este programa genera 20 numeros aleatorios entre el 0 y el 100 y los ordena de manera que los numeros pares sean los primeros y los impares vengan despues");
    
    for(int i = 0; i<20; i++){
      num[i] = (int) (Math.random()*101);
    }
    
    for(int i = 0; i<20; i++){
      System.out.print(num [i]+ " ");
    }
    System.out.println();
    System.out.println("--------------------------");
    for(int i = 0; i<20; i++){
      if ((num[i] % 2) == 0){
        par [i] = num[i];
      } else {
        impar [i] = num[i];
      }
    }
    
    for (int i = 0; i<20; i++){
      if (par[i] == 0){
        System.out.print("");
      } else {
        System.out.print(par [i]+ " ");
      }
    }
    
    for (int i = 0; i<20; i++){
      if (impar[i] == 0){
        System.out.print("");
      } else {
        System.out.print(impar [i] +" ");
      }
    }
  }
}
