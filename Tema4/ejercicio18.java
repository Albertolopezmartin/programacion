public class ejercicio18 {
  public static void main (String[] args) {
    int numero;
    System.out.println("Este programa te dice la primera cifra de un numero(de max 5 cifras) que escribas");
    
    System.out.println("Escribe aqui tu numero");
    
    numero = Integer.parseInt(System.console().readLine());
    
    if (numero<10) {
      System.out.println("La primera cifra de tu numero es: "+ numero);
    }
    
    if (numero>=10 && numero<100) {
      System.out.println("La primera cifra de tu numero es: "+ (numero/10));
    }
    
    if (numero>=100 && numero<1000) {
      System.out.println("La primera cifra de tu numero es: "+ (numero/100));
    }
    
    if (numero>=1000 && numero<10000) {
      System.out.println("La primera cifra de tu numero es: "+ (numero/1000));
    }
    
    if (numero>=10000 && numero<100000) {
      System.out.println("La primera cifra de tu numero es: "+ (numero/10000));
    } else {
      System.out.println("Ese numero no es compatible con este programa");
    }
  }
}
