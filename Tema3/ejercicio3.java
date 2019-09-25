public class ejercicio3 {
  public static void main (String[] args){
    int pesetas;
    
    System.out.println("Este programa convierte de pesetas a euros. Escribe el primer numero de pesetas: ");
    pesetas = Integer.parseInt(System.console().readLine());
    
    float conversorEu = pesetas / 166.386f;
    
    System.out.println("El resultado de la conversión es: "+conversorEu);
  }
}
