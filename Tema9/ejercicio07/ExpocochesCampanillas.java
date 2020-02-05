//Alberto López Martín 1ºDAW

public class ExpocochesCampanillas {
  public static void main(String[] args) {
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    int opcion = 0;
    int opcion2 = 0;
    int n = 0;
    
    do {
      System.out.println("EXPOCOCHES CAMPANILLAS");
      System.out.println("1. Mostrar número de entradas libre");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println("Elige una opción: ");
      
      opcion = Integer.parseInt(System.console().readLine());
      if (opcion == 1){
        System.out.println("En la zona principal hay " +principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona VIP hay " +vip.getEntradasPorVender());
      }
      
      if (opcion == 2){
        System.out.println("1. Principal");
        System.out.println("2. Compra-Venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
        
        opcion2 = Integer.parseInt(System.console().readLine());
        
        System.out.print("¿Cuantas entradas quieres?: ");
        
        n = Integer.parseInt(System.console().readLine());
        
        switch (opcion2) {
          case 1:
          principal.vender(n);
          break;
          case 2:
          compraVenta.vender(n);
          break;
          case 3:
          vip.vender(n);
          break;
          default:
        }
      }
    } while (opcion < 3);
  }
}
