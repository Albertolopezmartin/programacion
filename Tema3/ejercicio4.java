public class ejercicio4 {
  public static void main (String[] args) {
    int numero1;
    int numero2;
    
    System.out.println("Este programa realiza varias operaciones a dos numeros capturados. Escribe ahora los dos números:");
    numero1 = Integer.parseInt(System.console().readLine());
    numero2 = Integer.parseInt(System.console().readLine());
    
    int suma = numero1 + numero2;
    
    System.out.println("Este es el resultado de la suma: "+ suma);
    
    int resta = numero1 - numero2;
    
    System.out.println("Este es el resultado de la resta: "+ resta);
    
    int mult = numero1 * numero2;
    
    System.out.println("Este es el resultado de la multiplicación: "+ mult);
    
    int div = numero1 / numero2;
    
    System.out.println("Este es el resultado de la división: "+ div);
    
  }
}
