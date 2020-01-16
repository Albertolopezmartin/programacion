//Alberto López Martín 1ºDAW

public class pruebaAnimales{
  public static void main(String[] args){
    Pinguino tux = new Pinguino(Sexo.HEMBRA);
    tux.come("pescado");
    tux.nada();
    
    Perro leo = new Perro(Sexo.MACHO);
    leo.duerme();
    leo.dameLaPata();
    leo.amamantar();
    leo.ladra();
    
    Lagarto caiman = new Lagarto(Sexo.MACHO);
    caiman.tomaElSol();
    caiman.duerme();
  }
}
