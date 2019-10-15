//Alberto López Martín 1º DAW
public class ejercicio12 {
  public static void main (String[] args) {
    int n1;
    int n2;
    int n3;
    int cuantosMuestra;
    n1 = 0;
    n2 = 1;
    n3 = 0;
    
    System.out.println("Este programa muestra cuantos numeros de la serie de Fibonacci que tu quieras");
    System.out.println("Introduce cuantos numeros de la serie que quieras que salgan");
    do {
      cuantosMuestra = Integer.parseInt(System.console().readLine());
      }while (cuantosMuestra<=2);
      System.out.print ("Los primeros " + cuantosMuestra + " numeros de la serie de Fibonacci son: " + n1 +" " + n2+" ");
    for (int i = 0; i < (cuantosMuestra-2); i++){
      n3 = n1+n2;
      System.out.print(" " +n3+ " ");
      n1=n2;
      n2=n3;
    }
  }
}
