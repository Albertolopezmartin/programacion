//Alberto López Martín 1ºDAW
import arrays.arraysbi;

public class ejercicioPrueba29al34 {
  public static void main(String[] args) {
    
    int[][] a = arrays.arraysbi.generaArrayBiInt(5, 8, 0, 100);
    
    arrays.arraysbi.muestraArrayBiInt(a);
    System.out.print("\nFila 2: ");
    arrays.arraysbi.muestraArrayInt(arrays.arraysbi.filaDeArrayBiInt(a, 2));
    System.out.print("\nColumna 6: ");
    arrays.arraysbi.muestraArrayInt(arrays.arraysbi.columnaDeArrayBiInt(a, 6));
    System.out.print("\nCoordenadas del 24 (fila, columna): ");
    arrays.arraysbi.muestraArrayInt(arrays.arraysbi.coordenadasEnArrayBiInt(a, 24));
    
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    arrays.arraysbi.muestraArrayBiInt(b);
    System.out.println("\nBusca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++){
        if (arrays.arraysbi.esPuntoDeSilla(b, i, j)){
          System.out.println("fila " + i + ", columna " + j + " -> " + b[i][j]);
        }
      }
    }
    
    arrays.arraysbi.muestraArrayBiInt(a);
    System.out.print("\nFila: ");
    int fila = Integer.parseInt(System.console().readLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(System.console().readLine());
    System.out.print("Dirección (nose/neso): ");
    String direccion = System.console().readLine();
    System.out.print("\nDiagonal: ");
    arrays.arraysbi.muestraArrayInt(arrays.arraysbi.diagonal(a, fila, columna, direccion));
  }
}
