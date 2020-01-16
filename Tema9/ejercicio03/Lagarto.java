//Alberto López Martín 1ºDAW

public class Lagarto extends Animal{
  
  public Lagarto(){
  }
  
  public Lagarto(Sexo s){
    super(s);
  }
  
  public void tomaElSol(){
    System.out.println("Estoy tomando el sol");
  }
  
  public void bañate(){
    System.out.println("Estoy dandome un chapuzon");
  }
  
  public void escondete(){
    System.out.println("Me he escondido");
  }
  
}

