//Alberto López Martín 1ºDAW
public class ejercicio02 {
  public static void main (String[] args) {
    int [][] num = new int [4][5];
    int fila;
    int columna;
    int sumaFila;
    int sumaColumna;
    int sumaTotal;
    sumaColumna = 0;
    sumaFila = 0;
    sumaTotal = 0;
    
    System.out.println("Introduce 20 numeros");
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++){
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    
    System.out.println();
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++){
        System.out.printf("%7d ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);
    }
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");
    
    for(columna = 0; columna < 5; columna++) {
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%7d ", sumaColumna);
    }
    System.out.printf("|%7d ", sumaTotal);
  }
}
