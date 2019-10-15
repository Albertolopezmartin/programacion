//Alberto López Martín 1º DAW
public class ejercicio20 {
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
      for (int out = 0; out < 2*i+1; ++out){
        if ((out == 0) || (out == 2*i)) {
          System.out.print(caracter);
        }else {
          System.out.print(" ");
        }
      }
        System.out.println();
      }
      
      for (int on = 0; on < 2*altura-1; ++on){
        System.out.print(caracter);
      }
    }
    }

