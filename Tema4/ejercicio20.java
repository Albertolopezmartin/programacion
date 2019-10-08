//Alberto López Martín 1º DAW
public class ejercicio20 {
  public static void main (String[] args) {
    int numero;
    System.out.println("Este programa te dice si un numero(de max 5 cifras) que escribas es capicua o no");
    
    System.out.println("Escribe aqui tu numero");
    
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero<10) {
      System.out.println("Tu numero es capicuo");
    }
    
    if (numero>=10 && numero<100) {
      if ((numero/10) == (numero%10)) {
        System.out.println("Tu numero es capicuo");
      } else {
        System.out.println("Tu numero no es capicuo");
      }
    }
    
    if (numero>=100 && numero<1000) {
      if ((numero/100) == (numero%10)) {
      System.out.println("Tu numero es capicuo");
    } else {
        System.out.println("Tu numero no es capicuo");
      }
    }
    
    if (numero>=1000 && numero<10000) {
      if (((numero/1000) == (numero%10)) && (((numero/100)%10) == ((numero/10)%10))) {
      System.out.println("Tu numero es capicuo");
      } else {
        System.out.println("Tu numero no es capicuo");
      }
    }
    
    if (numero>=10000 && numero<100000) {
      if (((numero/10000) == (numero%10)) && (((numero/1000)%10) == ((numero/10)%10))) {
      System.out.println("Tu numero es capicuo");
    } else {
      System.out.println("Tu numero no es capicuo");
    }
  }
 }
}
