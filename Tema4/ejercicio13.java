public class ejercicio13 {
  public static void main (String[] args) {
    int numero1;
    int numero2;
    int numero3;
    
    System.out.println("Este programa ordena tres numeros que se introduzcan de menor a mayor");
    
    System.out.println("Introduce el primer numero: ");
    
    numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el segundo numero: ");
    
    numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el tercer numero: ");
    
    numero3 = Integer.parseInt(System.console().readLine());
    
    System.out.println("----------------------------");
    
    if (numero1<numero2) {
      if (numero1<numero3) {
        System.out.println(numero1);
        if (numero2<numero3) {
          System.out.println(numero2);
          System.out.println(numero3);
        } else {
          System.out.println(numero3);
          System.out.println(numero2);
        }
      } else {
        System.out.println(numero3);
        System.out.println(numero1);
        System.out.println(numero2);
      }
    } else {
      if (numero2<numero3) {
        System.out.println(numero2);
        if (numero1<numero3) {
          System.out.println(numero1);
          System.out.println(numero3);
        } else {
          System.out.println(numero3);
          System.out.println(numero1);
        }
      } else {
        System.out.println(numero3);
        System.out.println(numero2);
        System.out.println(numero1);
      }
    }
  }
}
