//Alberto López Martín

public class Publicacion {
  private String isbn;
  private String titulo;
  private int anyo;
  
  public Publicacion(String isbn, String titulo, int anyo){
    this.isbn = isbn;
    this.titulo = titulo;
    this.anyo = anyo;
  }
  
  @Override
  public String toString(){
    return "ISBN: " + isbn + ", Titulo: " + titulo + ", Publicado en: " + anyo;
  }
} 
