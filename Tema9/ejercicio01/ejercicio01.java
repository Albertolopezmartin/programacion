//Alberto López Martín 1ºDAW

public class ejercicio01 {
  public static void main(String[] args) {
    
    Caballo a = new Caballo("Bojack", "Marron", 60, 2);
    Caballo b = new Caballo("Artak", "Blanco", 8, 5);
    
    System.out.println("Hola, me llamo "+ a.getNombre()+ " obviamente");
    a.rumia();
    a.relincha();
    
    System.out.println("Hola, soy "+ b.getNombre());
    b.cabalga();
    b.relincha();
  }
}
    
