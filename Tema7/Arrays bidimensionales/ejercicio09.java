//Alberto López Martín 1ºDAW
public class ejercicio09 {
  public static void main (String[] args) {
    int[][] reloj = new int [12][12];
    int aux1;
    int aux2;
    int capa;
    
    System.out.println("Array original");
    System.out.println("--------------");
    
    for(int i = 0; i<12;i++){
      for(int j = 0; j<12;j++){
        reloj[i][j]=(int)(Math.random() * 101);
        System.out.printf("%5d", reloj[i][j]);
      }
      System.out.println();
    }
    
    System.out.println("Array final");
    System.out.println("--------------");
    for (capa = 0;capa <6; capa++){
      
      aux1= reloj[capa][11-capa];
      for (int i = 11 - capa; i > capa; i--) {
        reloj[capa][i]=reloj[capa][i-1];
      }
      
      aux2= reloj[11-capa][11-capa];
      for (int i = 11 - capa; i > capa; i--) {
        reloj[i][11-capa]=reloj[i-1][11-capa];
      }
      
      reloj[capa+1][11-capa]= aux1;
      for (int i = capa; i < 11 - capa - 1; i++) {
        reloj[11-capa][i]=reloj[11-capa][i+1];
      }
      reloj[11-capa][11-capa-1]= aux2;
      
      for (int i =capa;i<11-capa;i++){
        reloj[i][capa]=reloj[i+1][capa];
      }
      reloj[11-capa-1][capa]=aux1;
    }
    
    for(int i=0;i<12;i++){
      for(int j=0;j<12;j++){
        System.out.printf("%5d", reloj[i][j]);
      } 
      System.out.println();
    }
  }
}
