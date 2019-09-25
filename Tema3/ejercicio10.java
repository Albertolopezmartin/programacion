public class ejercicio10 {
  public static void main (String[] args) {
    int mb;
    
    System.out.println("Este programa convierte Mb a Kb. Escribe la cantidad de Mb a convertir:");
    
    mb = Integer.parseInt(System.console().readLine());
    
    int conversion = mb * 1024;
    
    System.out.println("El numero de Kb son: "+ conversion);
    
  }
  
}
