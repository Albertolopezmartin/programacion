public class ejercicio6 {
  public static void main (String[] args) {
    int altura;
    int base;
    
    System.out.println(" Este programa realiza el area de un triangulo. Escribe la altura y la base: ");
    altura = Integer.parseInt(System.console().readLine());
    base = Integer.parseInt(System.console().readLine());
    
    int area = (altura * base)/ 2;
    
    System.out.println(" El area de tu triangulo es: " + area);
    
    
  }
}
