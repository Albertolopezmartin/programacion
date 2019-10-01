public class TraductorDigitos {
  public static void main (String[] args){
    int numero;
    
    System.out.print("Indica digito 0-9: ");
    numero = Integer.parseInt(System.console().readLine());
    
    switch (numero) {
      case 0:
        System.out.println("Zero");
        break;
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("El resto de digitos");
      }
      
    
    
  }
  
}
