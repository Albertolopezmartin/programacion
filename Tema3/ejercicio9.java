public class ejercicio9 {
  public static void main (String[] args) {
    int radio;
    int altura;
    
    System.out.println("Este programa calcula el volumen de un cono. Escribe el radio y el altura del cono:");
    radio = Integer.parseInt(System.console().readLine());
    altura = Integer.parseInt(System.console().readLine());
    
    float volumen =(3.14f* radio*radio* altura)/3;
    
    System.out.println( "El volumen de tu cono es: "+ volumen);
    
    
  }
}
