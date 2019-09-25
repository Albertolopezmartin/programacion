public class ejercicio2 {
  public static void main (String[] args){
    float euros;
    
    System.out.println("Este programa convierte de euros a pesetas. Escribe el primer numero de euros: ");
    euros = Integer.parseInt(System.console().readLine());
    
    float conversorPes = euros * 166.386f;
    
    System.out.println("El resultado de la conversión es: "+conversorPes);
  }
}
