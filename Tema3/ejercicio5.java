public class ejercicio5 {
  public static void main (String[] args) {
    int altura;
    int base;
    
    System.out.println(" Este programa realiza el area de un rectangulo. Escribe la altura y la base: ");
    altura = Integer.parseInt(System.console().readLine());
    base = Integer.parseInt(System.console().readLine());
    
    int area = altura * base;
    
    System.out.println(" El area de tu rectángulo es: " + area);
    
    
  }
}

