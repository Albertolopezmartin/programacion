//Alberto López Martín 1ºDAW
// el constructor que viene en las opciones no he conseguido que funcione asi que he dejado una piramide construida con 5 de altura
public class pruebaPiramide {
  public static void main(String[] args) {
    int opcion = 0;
    int altura = 0;
    String caracter = "";
    
    Piramide miPiramide = new Piramide(5,"*");
    
    while (opcion!=6){
      System.out.println("1. Construye la piramide");
      System.out.println("2. Aumenta la altura de la piramide en una fila siempre que no se pase de 12 filas");
      System.out.println("3. Disminuye la altura de la piramide en una fila siempre que haya mas de 1 fila");
      System.out.println("4. Cambia el caracter con el que se dibuja la piramide");
      System.out.println("5. Dibuja la piramide");
      System.out.println("6. Se sale del programa");
      System.out.print("Elige una opción (1-6): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion){
        case 1:
        System.out.print("¿Cuantas filas quiere que tenga la piramide?: ");
        altura = Integer.parseInt(System.console().readLine());
        if (altura<1 || altura>12){
          System.out.println("Esta altura no es correcta, tiene que ser entre 1 y 12");
        } else {
          System.out.print("Escribe el caracter con el que quieras que se pinte la piramide: ");
          caracter = System.console().readLine();
        }
        System.out.println("-----------------------------------------");
        break;
        case 2:
        miPiramide.Aumentar();
        System.out.println("-----------------------------------------");
        break;
        case 3:
        miPiramide.Disminuir();
        System.out.println("-----------------------------------------");
        break;
        case 4:
        System.out.print("Escribe el caracter nuevo: ");
        caracter = System.console().readLine();
        miPiramide.CambiarDibujo(caracter);
        System.out.println("-----------------------------------------");
        break;
        case 5:
        System.out.println(miPiramide.toString());
        System.out.println("-----------------------------------------");
        default:
      }
    }
  }
}
