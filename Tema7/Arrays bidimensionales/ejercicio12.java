//Alberto López Martín 1ºDAW
public class ejercicio12 {
  public static void main (String[] args) {
    int [][] num = new int [9][9];
    int maximo = 500;
    int minimo = 900;
    int suma = 0;
    
    for(int i = 0; i<9;i++){
      for(int j = 0; j<9;j++){
        num[i][j]=(int)(Math.random() * 401)+500;
        System.out.printf("%5d", num[i][j]);
      }
      System.out.println();
    }
    
    System.out.print("\nDiagonal desde la esquina inferior izquierda ");
    System.out.println("a la esquina superior derecha: ");
    
    for (int i = 0; i<9;i++){
      int numero = num[8 - i][i];
      System.out.print(numero+ " ");
      if (numero > maximo){
        maximo = numero;
      }
      if (numero < minimo){
        minimo = numero;
      }
      suma+= numero;
    }
    
    System.out.println("\nMáximo: " + maximo);
    System.out.println("Mínimo: " + minimo);
    System.out.println("Media: " + ((double)suma / 10));
  }
}

