//Alberto López Martín 1ºDAW
public class ejercicio07 {
  public static void main (String[] args) {
    int [] num;
    num = new int [100];
    int numCambiar;
    int numNuevo;
    
    for(int i = 0; i<100; i++){
      num[i] = (int) (Math.random()*21);
    }
    
    for(int i = 0; i<100; i++){
      System.out.print(num[i]+ " ");
    }
    
    System.out.println();
    
    System.out.println("---------------------------");
    System.out.println("Introduce el numero de los anteriores que quieras que se cambie por otro que introduzcas despues");
    
    System.out.println("Introduce aqui el numero a cambiar");
    numCambiar = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el nuevo numero que quieres introducir");
    numNuevo = Integer.parseInt(System.console().readLine());
    
    for(int i = 0; i<100; i++){
      if (num[i] == numCambiar){
        num[i] = numNuevo;
      }
      System.out.print(num[i]+ " ");
    }
  }
}
