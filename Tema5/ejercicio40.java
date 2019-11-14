//Alberto López Martín 1ºDAW
public class ejercicio40 {
  public static void main (String[] args) {
    int altura;
    
    System.out.println("Introduce la altura del rombo, debe de ser impar y mayor o igual que 3");
    
    do{
      altura= Integer.parseInt(System.console().readLine());
      if ((altura < 3) || (altura % 2 == 0)){
        System.out.println("Error. La altura debe ser impar y mayor o igual que 3");
      }
    } while ((altura < 3) || (altura % 2 == 0));
    
    
    for (int i = 0; i < altura-1; ++i){
      for (int rell = 0; rell < altura-i-1; ++rell){
        System.out.print(" ");
      }
      for (int out = 0; out < 2*i+1; ++out){
        if ((out == 0) || (out == 2*i)) {
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
        System.out.println();
      }
    
    int anchuraLinea = altura*2-1;
    for (int i=0; i<altura; i++){
      for (int j=0; j<i; j++){
        System.out.print(" ");
      }
      for (int j=0; j<anchuraLinea; j++) {
        if ((j == 0) || (j == anchuraLinea-1)) {
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
      anchuraLinea-= 2;
    }
  }
}
