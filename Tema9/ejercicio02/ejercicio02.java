//Alberto López Martín 1ºDAW

public class ejercicio02 {
  public static void main(String[] args) {
    int opcion = 0;
    int km = 0;
    
    bicicleta miBici = new bicicleta(10);
    coche miCoche = new coche(320);
    System.out.println("-------------Vehiculos-------------------");
    while (opcion!=8){
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion){
        case 1:
        System.out.print("¿Cuantos kilometros quieres recorrer?: ");
        km = Integer.parseInt(System.console().readLine());
        miBici.andaKilometros(km);
        System.out.println("-----------------------------------------");
        break;
        case 2:
        miBici.hacerCaballito();
        System.out.println("-----------------------------------------");
        break;
        case 3:
        System.out.print("¿Cuantos kilometros quieres recorrer?: ");
        km = Integer.parseInt(System.console().readLine());
        miCoche.andaKilometros(km);
        System.out.println("-----------------------------------------");
        break;
        case 4:
        miCoche.quemarRueda();
        System.out.println("-----------------------------------------");
        break;
        case 5:
        System.out.println("La bicicleta lleva recorridos " + miBici.getkilometrosRecorridos()+ " Km");
        System.out.println("-----------------------------------------");
        break;
        case 6:
        System.out.println("El coche lleva recorridos " + miCoche.getkilometrosRecorridos()+ " Km");
        System.out.println("-----------------------------------------");
        break;
        case 7:
        System.out.println("Todos los vehiculos llevan recorridos " + vehiculo.getkilometrosTotales()+ " Km");
        System.out.println("-----------------------------------------");
        default:
      }
    }
  }
 }
