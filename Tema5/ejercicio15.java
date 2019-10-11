//Alberto López Martín 1º DAW
public class ejercicio15 {
  public static void main (String[] args) {
    double base;
    int exponente;
    
    System.out.println("Este programa calcula la potencia de una base que indiques al exponente que indiques y muestra todas las exponencias de incremento en incremento");
    
    System.out.println("Escribe la base");
    base = Double.parseDouble(System.console().readLine());
    System.out.println("Escribe el exponente");
    exponente = Integer.parseInt(System.console().readLine());
    System.out.println("-------------------");
    
    for (int i = 0; i < exponente; i++) {
      System.out.println(" "+base);
      base = base*base;
    }
  }
}
