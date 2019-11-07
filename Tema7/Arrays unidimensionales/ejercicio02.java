//Alberto López Martín 1ºDAW
public class ejercicio02 {
  public static void main (String[] args) {
    char[] simbolo;
    simbolo = new char[12];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[8] = '+';
    simbolo[9] = 'Q';
    
    for (int i = 0; i<12; i++){
      System.out.print("El valor del array " +(i+1)+ " : ");
      System.out.println(simbolo[i]);
    }
  }
}
