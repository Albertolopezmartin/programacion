//Alberto López Martín 1ºDAW

public class Perro extends Mamifero{
  
  public Perro(Sexo s){
    super(s);
  }
  
  public void ladra(){
    System.out.println("Woof Woof");
  }
  
  public void dameLaPata(){
    System.out.println("Here is my paw!");
  }
  
  public void caza(){
    System.out.println("I love hunting birds");
  }
}

