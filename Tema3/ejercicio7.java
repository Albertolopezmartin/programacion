public class ejercicio7 {
  public static void main (String[] args) {
    int factura;
    
    System.out.println("Este programa te da el total de la factura con el iva añadido. Escribe aqui la factura sin iva: ");
    factura = Integer.parseInt(System.console().readLine());
    
    float iva = factura * 1.21f;
    
    System.out.println(" Tu factura con el iva incluido es: "+iva);
    
  }
  
}
