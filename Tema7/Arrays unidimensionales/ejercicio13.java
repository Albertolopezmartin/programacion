//Alberto López Martín 1ºDAW
public class ejercicio13 {
  public static void main (String[] args) {
    int [] num;
    num = new int [100];
    int numResaltar;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("Este programa saca numeros por pantalla comprendidos entre el 0 y el 500");
    
    for (int i = 0; i<100; i++){
      num[i] = (int) (Math.random()*501);
      if (num[i] < minimo) {
        minimo = num[i];
      }
      
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    
    System.out.println("------------------------------------------------------------");
    
    for(int i = 0; i<100; i++){
      System.out.print(num [i]+ " ");
    }
    
    System.out.println("------------------------------------------------------------");
    
    System.out.println("Introduce si quieres que se resalte el numero maximo(1) o el minimo(2)");
    numResaltar = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i<100; i++){
      switch (numResaltar){
        case 1:
        if (num[i]==maximo){
          System.out.print("**"+num[i]+"** ");
        } else {
          System.out.print(num[i]+" ");
        }
        break;
        case 2:
        if (num[i]==minimo){
          System.out.print("**"+num[i]+"** ");
        } else {
          System.out.print(num[i]+" ");
        }
        break;
      }
    }
  }
}
