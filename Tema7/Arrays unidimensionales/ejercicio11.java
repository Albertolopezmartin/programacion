//Alberto López Martín 1ºDAW
public class ejercicio11 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int [] primo;
    primo = new int [10];
    int [] noPrimo;
    noPrimo = new int [10];
    
    System.out.println("Introduce 10 numeros, despues se mostraran los numeros que has introducidos y a continuación pasara los numeros primos al principio");
    
    for(int i = 0; i<10; i++){
      System.out.print("Introduce el "+(i+1)+" : ");
      num [i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    System.out.println("Los numeros que has introducido en orden son :");
    for(int i = 0; i<10; i++){
      System.out.print (num[i] + " ");
    }
    
    
    System.out.println();
    System.out.println("Los numeros que has introducido con los primos movidos al principio son:");
    
    for(int i = 0; i<10; i++){
      if(num[i]%2 == 0){
        noPrimo[i] = num[i];
      } else{
        primo[i] = num[i];
      }
    }
    
    for(int i = 0; i<10; i++){
      if(primo[i] == 0){
        System.out.print("");
      } else {
        System.out.print(primo[i]+ " ");
      }
    }
    
    for(int i = 0; i<10; i++){
      if(noPrimo[i] == 0){
        System.out.print("");
      } else {
        System.out.print(noPrimo[i]+ " ");
      }
    }
  }
}
