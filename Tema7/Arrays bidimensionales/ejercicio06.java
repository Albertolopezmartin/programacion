//Alberto López Martín 1ºDAW
public class ejercicio06 {
  public static void main (String[] args) {
    int [][] num = new int [6][10];
    int fila;
    int columna;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    boolean repetido = false;
    
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++){
        do{
          num[fila][columna] = (int)(Math.random() * 1001);
          repetido = false;
            for (int i = 0; i < 10 * fila + columna; i++) {
              if (num[fila][columna] == num[i / 10][i % 10]) {
                repetido = true;
              }
            }
          } while (repetido);
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
        }
      
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
        }
      }
    }
    
    for (fila = 0; fila < 4; fila++) {
        for (columna = 0; columna < 5; columna++){
          System.out.printf("%7d ", num[fila][columna]);
        }
      }
    
    System.out.println();
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++){
        if (num[fila][columna] == minimo){
          System.out.println("El numero que esta en la fila "+ fila+" y la columna "+ columna+ " es el " + num[fila][columna]+ " y es el minimo");
        }
        
        if (num[fila][columna] == maximo){
          System.out.println("El numero que esta en la fila "+ fila+" y la columna "+ columna+ " es el " + num[fila][columna]+ " y es el maximo");
        }
      }
    }
    
  }
}

