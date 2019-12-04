//Alberto López Martín 1ºDAW
public class ejercicio08 {
  public static void main (String[] args) {
    int[][] cuadrante = new int[8][8];
    String posicionAlfil;
    int fila;
    int columna;
    
    System.out.print("Introduce la posición del alfil,por ejemplo d5: ");
    posicionAlfil=System.console().readLine();
    columna = (int)(posicionAlfil.charAt(0)) - 96;
    fila = (int)(posicionAlfil.charAt(1)) - 48;
    
    System.out.println("El alfil puede moverse a las siguientes posiciones: ");
    for (int i =8; i >= 1;i--){
      for (int j = 1; j <= 8;j++){
        if ((Math.abs(fila - i) == Math.abs(columna - j))
            && (! ((fila == i) && (columna == j)))) {
          System.out.print((char)(j + 96) + "" + i + " ");
        }
      }
    }
  }
}
