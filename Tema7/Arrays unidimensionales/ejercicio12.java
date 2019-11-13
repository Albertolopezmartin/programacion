//Alberto López Martín 1ºDAW
public class ejercicio12 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int posInicial;
    int posFinal;
    int aux;
    
    System.out.println("Introduce 10 numeros");
    
    for(int i = 0; i<10; i++){
      System.out.println("Introduce el " + i + " numero");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int i = 0; i<10; i++){
      System.out.print("El " + i + " numero es: ");
      System.out.println(num[i]);
    }
    
    System.out.println();
    System.out.println("Introduce ahora la posición de un numero que quieras cambiar por la posición de otro numero que aparezca mas adelante");
    
    do{
      System.out.println("Introduce la posición del numero inicial");
      posInicial = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduce la posición del numero final");
      posFinal = Integer.parseInt(System.console().readLine());
      if ((posInicial==posFinal) || (posInicial>10) || (posInicial<0) || (posFinal>10) || (posFinal<0)){
        System.out.print("Los valores son incorrectos. ");
      }
    } while ((posInicial==posFinal) || (posInicial>10) || (posInicial<0) || (posFinal>10) || (posFinal<0));
      
    aux = num[posFinal];
    
    num[posFinal] = num[posInicial];
    num[posInicial] = aux;
    
    for(int i = 0; i<10; i++){
      System.out.print("El " + i + " numero es: ");
      System.out.println(num[i]);
    }
  }
}
