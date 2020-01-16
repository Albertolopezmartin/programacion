//Alberto López Martín 1ºDAW

public class vehiculo{
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos;
  
  public vehiculo(){
    this.kilometrosRecorridos = 0;
  }
  
  public int getkilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getkilometrosTotales() {
    return vehiculo.kilometrosTotales;
  }
  
  public void andaKilometros(int k){
    this.kilometrosRecorridos += k;
    vehiculo.kilometrosTotales += k;
  }
}
