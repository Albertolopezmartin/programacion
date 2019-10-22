//Alberto López Martín 1º DAW
public class ejercicio27 {
  public static void main (String[] args) {
    int numIntro;
    int contador;
    int suma;
    contador = 0;
    suma = 0;
    
    System.out.println("Este programa te dice los multiplos de 3, cuantos hay, y la suma de ellos que haya entre el uno y el numero que introduzcas");
    
    System.out.println("Introduce el numero");
    numIntro = Integer.parseInt(System.console().readLine());
    
    System.out.println("--------------------");
    
    for (int i = 1; i <numIntro; i++) {
      if ((i % 3) == 0) {
        System.out.println(i);
        contador++;
        suma +=i;
      }
    }
    
    System.out.println("Hay " + contador + " multiplos de 3 desde el 1 hasta el numero que has puesto");
    System.out.println("La suma de los multiplos de tres que hay entre el 1 y el numero que has puesto es : " + suma);
    
  }
}
