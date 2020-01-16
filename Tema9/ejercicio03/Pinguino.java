//Alberto López Martín 1ºDAW

public class Pinguino extends Ave{
  
  public Pinguino(){}
  
  public Pinguino(Sexo s){
    super(s);
  }
  
  public void vuela(){
    System.out.println("Soy un pinguino asi que no puedo volar");
  }
  
  public void nada(){
    System.out.println("Me encanta nadar");
  }
}
