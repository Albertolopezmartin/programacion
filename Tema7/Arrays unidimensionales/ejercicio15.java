//Alberto López Martín 1ºDAW
public class ejercicio15 {
  public static void main (String[] args) {
    int [] num;
    num = new int [10];
    int reservas;
    int personas;
    personas = 0;
    int j = 0;
    
    System.out.print("Mesa nº ");
    for (int i = 0; i<10; i++){
      System.out.print((i+1)+ " ");
    }
    
    System.out.println();
    System.out.print("Ocupacion ");
    for (int i = 0; i<10; i++){
      reservas = (int) (Math.random()*5);
      num[i] = reservas;
      System.out.print(num[i]+ " ");
    }
    
    System.out.println();
    System.out.println();
    do{
      System.out.print("¿Cuantas personas son?(Introduce -1 para salir): ");
      personas = Integer.parseInt(System.console().readLine());
      if ((personas>0) && (personas<=4)){
        do{
          if (num[j]==0){
            System.out.println("Por favor sientense en la mesa numero " + (j+1));
            num[j]+=personas;
            System.out.print("Mesa nº ");
            for (int i = 0; i<10; i++){
              System.out.print((i+1)+ " ");
            }
            
            System.out.println();
            System.out.print("Ocupacion ");
            for (int i = 0; i<10; i++){
              System.out.print(num[i]+ " ");
            }
            
            System.out.println();
            System.out.println();
          }
          j++;
        } while (num[j]>0);
        j = 0;
        do{
          if ((personas-num[j])<=4){
            System.out.println("Van a tener que compartir mesa. Por favor sientense en la mesa numero " + (j+1));
            num[j]+=personas;
            System.out.print("Mesa nº ");
            for (int i = 0; i<10; i++){
              System.out.print((i+1)+ " ");
            }
            System.out.println();
            System.out.print("Ocupacion ");
            for (int i = 0; i<10; i++){
              System.out.print(num[i]+ " ");
            }
            System.out.println();
            System.out.println();
          }
          j++;
        } while ((personas-num[j])<=4);
      } else {
        if (personas>4){
          System.out.println("No admitimos grupos de " + personas + " haga grupos de 4 personas como máximo e intente de nuevo");
        }
      }
    } while (personas>0);
  }
}
