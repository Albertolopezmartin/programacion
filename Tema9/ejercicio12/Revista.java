//Alberto López Martín

public class Revista extends Publicacion{
  private int numero;
  
  public Revista(String isbn, String titulo, int anyo, int numero){
    super(isbn, titulo, anyo);
    this.numero = numero;
  }
}
