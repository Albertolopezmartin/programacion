public class ejercicio11 {
  public static void main (String[] args) {
    int kb;
    
    System.out.println("Este programa convierte Kb a Mb. Escribe la cantidad de Mb a convertir:");
    
    kb = Integer.parseInt(System.console().readLine());
    
    int conversion = kb / 1024;
    
    System.out.println("El numero de Mb son: "+ conversion);
    
    
  }
}
