public class ejercicio05 {
  public static void main (String[] args) {
    double a;
    double b;
    double x;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    
    System.out.println("Introduce el valor de a: ");
    
    a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b: ");
    
    b = Double.parseDouble(System.console().readLine());
    
    x= -b/a;
    
    if ((a*x) +b  == 0) {
      System.out.println ("El valor de x es: " + x);
    } else {
      System.out.println ("Esta ecuación no tiene solución");
    }
  }
}

