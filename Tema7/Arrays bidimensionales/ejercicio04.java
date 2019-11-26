//Alberto López Martín 1ºDAW
public class ejercicio04 {
  public static void main (String[] args)
      throws InterruptedException {
      int [][] num = new int [4][5];
      int fila;
      int columna;
      int sumaFila;
      int sumaColumna;
      int sumaTotal;
      sumaColumna = 0;
      sumaFila = 0;
      sumaTotal = 0;
      
      System.out.println("20 numeros aleatorios se suman a partir de columnas y filas");
      for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++){
          num[fila][columna] = (int)(Math.random() * 900) + 100;
        }
      }
      
      System.out.println();
      
      for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++){
          System.out.printf("%7d ", num[fila][columna]);
          sumaFila += num[fila][columna];
        }
        Thread.sleep(1000);
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
        Thread.sleep(1000);
        System.out.printf("%7d ", sumaColumna);
      }
      Thread.sleep(1000);
      System.out.printf("|%7d ", sumaTotal);
    
  }
}

