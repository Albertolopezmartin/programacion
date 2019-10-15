//Alberto López Martín 1º DAW
public class ejercicio19 {
  public static void main (String[] args) {
    int altura;
    String caracter;
    
    System.out.println("Este programa pinta una piramide de la altura y con el caracter que indiques");
    
    System.out.println("Introduzca la altura");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el caracter");
    
    caracter = System.console().readLine();
    
    System.out.println("----------------------");
    
    for (int i = 0; i < altura; ++i){
      for (int rell = 0; rell < altura-i-1; ++rell){
        System.out.print(" ");
      }
      for (int on = 0; on < 2*i+1; ++on){
        System.out.print(caracter);
      }
      System.out.println();
    }
    }
  }

