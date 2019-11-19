//Alberto López Martín 1ºDAW
public class ejercicio16 {
  public static void main (String[] args) {
    int [] num;
    num = new int [20];
    int multiplos;
    
    for(int i = 0; i<20; i++){
      num[i] = (int) (Math.random()*401);
    }
    
    for(int i = 0; i<20; i++){
      System.out.print(num[i]+" ");
    }
    
    System.out.println();
    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    multiplos = Integer.parseInt(System.console().readLine());
    
    if (multiplos==1){
      for(int i = 0; i<20; i++){
        if(num[i]%5==0){
          System.out.print("["+num[i]+"]"+" ");
        } else {
          System.out.print(num[i]+" ");
        }
      }
    }
    if (multiplos==2){
      for(int i = 0; i<20; i++){
        if(num[i]%7==0){
          System.out.print("["+num[i]+"]"+" ");
        } else {
          System.out.print(num[i]+" ");
        }
      }
    }
  }
}
