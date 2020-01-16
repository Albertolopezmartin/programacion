//Alberto López Martín 1ºDAW

public class Ave extends Animal{
  
  public Ave(){
    super();
  }
  
  public Ave(Sexo s){
    super(s);
  }
  
  public void ponHuevo(){
    if (this.getSexo() == Sexo.MACHO){
      System.out.println("Soy macho, no puedo poner huevos");
    } else {
      System.out.println("Soy hembra, asi que si puedo poner huevos");
    }
  }
  
  public void limpiate(){
    System.out.println("Me estoy limpiando las plumas");
  }
  
  public void vuela(){
    System.out.println("Estoy volando");
  }
}
