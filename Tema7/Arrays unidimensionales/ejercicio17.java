//Alberto López Martín 1ºDAW
public class ejercicio17 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int primero;
    int [] ordenado;
    ordenado = new int [10];
    
    for(int i = 0; i<10; i++){
      num[i] = (int) (Math.random()*101);
    }
    
    for(int i = 0; i<10; i++){
      System.out.print(num[i]+" ");
    }
    
    System.out.println();
    System.out.print("Introduce el numero que quieras de los anteriores que pase a la primera posicion");
    primero = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i<10; i++){
      if (num[i]==primero){
        ordenado [0] = primero;
        num [i] = num[9];
      }
    }
    for (int i = 0; i<9; i++){
      ordenado [i+1] = num[i];
    }
    
    for(int i = 0; i<10; i++){
      System.out.print(ordenado[i]+" ");
    }
  }
}
