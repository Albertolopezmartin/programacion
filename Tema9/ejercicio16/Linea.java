//Alberto López Martín

public class Linea{
  private Punto inicial;
  private Punto end;
  
  public Linea(Punto inicial, Punto end){
    this.inicial = inicial;
    this.end = end;
  }
  
  @Override
  public String toString() {
    return "Línea formada por los puntos " + inicial + " y " + end;
  }
}
