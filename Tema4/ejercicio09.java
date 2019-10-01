public class ejercicio09 {
  public static void main (String[] args) {
    double a;
    double b;
    double c;
    double x;
    double aux;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax(al cuadrado) + bx + c = 0");
    
    System.out.println("Introduce el valor de a: ");
    
    a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b: ");
    
    b = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de c: ");
    
    c = Double.parseDouble(System.console().readLine());
    
    x= -c/b;
    x= -b +(Math.sqrtb*b-(4*a*c))
    
    if ((a**x) +(b*x)  == 0) {
      System.out.println ("El valor de x es: " + x);
    } else {
      System.out.println ("Esta ecuación no tiene solución");
    }
  }
}
