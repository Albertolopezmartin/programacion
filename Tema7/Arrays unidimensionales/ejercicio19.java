//Alberto López Martín 1ºDAW
public class ejercicio19 {
  public static void main (String[] args) {
    int [] num;
    num = new int [12];
    int numIntro;
    int dondeInsertar;
    
    System.out.print("Indice ");
    
    for (int i = 0; i<12; i++){
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor ");
    for (int i = 0; i<12; i++){
      num[i]= (int) (Math.random()*201);
      System.out.printf("%4d ", num[i]);
    }
   
   System.out.println();
   
   System.out.print("Introduce el numero que quieras insertar en el array: ");
   numIntro = Integer.parseInt(System.console().readLine());
   System.out.print("En que posición quieres que se coloque tu numero(0-11): ");
   dondeInsertar = Integer.parseInt(System.console().readLine());
   
   for (int i = 11; i > dondeInsertar; i--) {
    num[i] = num[i - 1];
  }
   
   num[dondeInsertar] = numIntro; 
   
   System.out.print("\nIndice ");
    
    for (int i = 0; i<12; i++){
      System.out.printf("%4d ", i);
    }
    
    
    System.out.print("\nValor ");
    for (int i = 0; i<12; i++){
      System.out.printf("%4d ", num[i]);
    }
  }
}
