//Alberto López Martín 1ºDAW
public class ejercicio01 {
  public static void main (String[] args) {
    int dado;
    int suma;
    
    suma = 0;
    
    System.out.println("Este programa da la tirada de tres dados y el resultado de la suma de las tres tiradas");
    
    for(int i = 0; i<3; i++){
      dado = (int) (Math.random()*6)+1;
      System.out.println(dado);
      suma = suma + dado;
    }
    System.out.println("El resultado de la suma es " +suma);
  }
}
