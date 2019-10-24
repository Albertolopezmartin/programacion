//Alberto López Martín 1º DAW
public class ejercicio30 {
  public static void main (String[] args) {
    int hora1;
    int hora2;
    int dia1;
    int dia2;
    
    
    System.out.println("Introduce la primera hora");
    hora1 = Integer.parseInt(System.console().readLine());
    
    if (hora1>24) {
      do {
        System.out.println("Datos incorrectos, las horas no pueden pasar de 24");
        System.out.println("Introduce la primera hora");
        hora1 = Integer.parseInt(System.console().readLine());
      } while (hora1>24); 
    
    System.out.println("Introduce el primer dia");
    dia1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la segunda hora");
    hora2 = Integer.parseInt(System.console().readLine());
    
    if (hora2>24) {
      do {
        System.out.println("Datos incorrectos, las horas no pueden pasar de 24");
        System.out.println("Introduce la segunda hora");
        hora2 = Integer.parseInt(System.console().readLine());
      } while (hora2>24);
    }
    
    System.out.println("Introduce el segundo dia");
    dia2 = Integer.parseInt(System.console().readLine());
    if (dia2<dia1) {
      do {
        System.out.println("Datos incorrectos, el segundo dia tiene que ser despues del primero");
        System.out.println("Introduce el primer dia");
        dia1 = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce el segundo dia");
        dia2 = Integer.parseInt(System.console().readLine());
      } while (dia2<dia1);
    }
    
    
    System.out.print ("Entre las "+ hora1+":00 del día " +dia1);
    System.out.print (" y las "+ hora2+":00 del día " +dia2);
    System.out.println(" hay "+ (((dia2 *24) + hora2) - ((dia1*24) + hora1)) + " horas");
  }
}
