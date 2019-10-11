//Alberto López Martín 1º DAW
public class ejercicio14 {
  public static void main (String[] args) {
    double base;
    int exponente;
    
    System.out.println("Este programa calcula la potencia de una base que indiques al exponente que indiques");
    
    System.out.println("Escribe la base");
    base = Double.parseDouble(System.console().readLine());
    System.out.println("Escribe el exponente");
    exponente = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i < exponente; i++) {
      base = base*base;
    }
    System.out.println("El resultado es "+base);
    
  }
}
