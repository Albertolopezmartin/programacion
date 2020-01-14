//Alberto López Martín 1ºDAW
package arrays;

public class arraysbi {
  
  public static int [][] generaArrayBiInt(int filas,int columnas,int minimo,int maximo){
    int [][] x = new int[filas][columnas];
    
    for (int i = 0; i< filas; i++){
      for (int j = 0; j<columnas; j++){
        x[i][j] = (int)(Math.random
