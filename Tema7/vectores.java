public class vectores {
  public static void main (String[] args) {
    
    int tamano;
    int[] vector;
    
    System.out.print("Dime la cantidad de datos: ");
    tamano = Integer.parseInt(System.console().readLine());
    vector = new int[tamano];
    
    for(int i = 0; i<tamano; i++){
      System.out.println("Introduce el dato "+ (i+1));
      vector[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int i = 0; i<tamano; i++){
      System.out.println("El numero "+ (i+1)+" es");
      System.out.println(vector[i]);
    }
  }
}
