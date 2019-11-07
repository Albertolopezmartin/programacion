//Alberto López Martín 1ºDAW
public class ejercicio04 {
  public static void main (String[] args) {
    int [] num;
    num = new int [20];
    int [] cuadrado;
    cuadrado = new int [20];
    int [] cubo;
    cubo = new int [20];
    
    for(int i = 0; i<20; i++){
      num[i] = (int) (Math.random()*101);
    }
    
    for(int i = 0; i<20; i++){
      cuadrado[i] = num[i]*num[i];
    }
    
    for(int i = 0; i<20; i++){
      cubo[i] = num[i]*num[i]*num[i];
    }
    
    for(int i = 0; i<20; i++){
      System.out.println(num[i]+ "| |"+cuadrado[i]+ "| |"+cubo[i]);
    }
  }
}
