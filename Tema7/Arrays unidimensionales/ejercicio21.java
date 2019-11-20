//Alberto López Martín 1ºDAW
public class ejercicio21 {
  public static void main (String[] args) {
    int [] num;
    num = new int [15];
    
    System.out.println("Array original:");
    
    for (int i = 0;i<15;i++){
      num[i]= (int) (Math.random()*501);
      System.out.print(num[i]+ " ");
    }
    
    System.out.println();
    System.out.println("Array cincuerizado:");
    
    for (int i = 0;i<15;i++){
      if (num[i]%5==0){
        System.out.print(num[i]+ " ");
      } else {
        do{
          num[i]++;
        } while(num[i]%5!=0);
        System.out.print(num[i]+ " ");
      }
    }
  }
}
