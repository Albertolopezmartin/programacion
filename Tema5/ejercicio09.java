//Alberto López Martín 1º DAW
public class ejercicio09 {
  public static void main (String[] args) {
    double numero;
    int numeroCifras;
    
    numeroCifras = 1;
    
    System.out.println("Este programa te dice cuantas cifra de un numero que escribas");
    
    System.out.println("Escribe aqui tu numero");
    
    numero = Double.parseDouble(System.console().readLine());
    
    while (numero>=10) {
      numero = numero/10;
      numeroCifras++;
    }
    
    System.out.println("Tu numero tiene estas cifras: " + numeroCifras);
  }
}
