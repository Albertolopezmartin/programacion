//Alberto López Martín 1ºDAW

public class pruebaTiempo {
  public static void main(String[] args) {
    Tiempo t1 = new Tiempo(1, 20, 30);
    Tiempo t2 = new Tiempo(5, 30, 26);
    Tiempo t3 = new Tiempo(4, 15, 19);
    
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
  }
}
