//Alberto López Martín 1º DAW
public class ejercicio12 {
  public static void main (String[] args) {
    int n1;
    int n2;
    int n3;
    int cuantosMuestra;
    n1 = 0;
    n2 = 1+n1;
    
    System.out.println("Este programa muestra cuantos numeros de la serie de Fibonacci que tu quieras");
    System.out.println("Introduce cuantos numeros de la serie que quieras que salgan");
    
    cuantosMuestra = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < cuantosMuestra ; i++) {
      System.out.println("" +n1);
      n1 = n2;
    }
  }
}
