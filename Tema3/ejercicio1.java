public class ejercicio1 {
  public static void  main (String[] args){
    int numero1;
    int numero2;
    
    System.out.println("Este programa captura dos numeros y los multiplica. Escribe el primer numero: ");
    numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe el segundo numero: ");
    numero2 = Integer.parseInt(System.console().readLine());
    
    int mult = numero1*numero2;
    
    System.out.println("Este es el resultado de la multiplicacion: " +mult);
    
  }
  
}
