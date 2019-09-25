public class ejercicio6 {
  public static void main(String [] args) {
    //precio con iva= precio sin iva * 1.21
    //precio sin iva= precio con iva / 1.21
    int baseImp = 30;
    float facturaIva = baseImp * 1.21f;
    
    System.out.println("El precio inicial de " +baseImp+ " pasa a ser con el IVA: "+(int)facturaIva);
    
  }
}
