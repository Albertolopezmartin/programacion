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
    
    if ((a== 0) && (b==0)) {
      System.out.println ("El valor de x es inconsecuente");
    }

    if ((a==0) && (b!=0)) {
      x= -c/b;
      System.out.println ("La x es: " + x);
    }

    if ((a!=0) && (b!=0)) {
      x= -b +(Math.sqrt(b*b)-(4*a*c));
      System.out.println ("La x es: " +x);
    }
  }
}

