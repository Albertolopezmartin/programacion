//Alberto López Martín 1º DAW
public class ejercicio32 {
  public static void main (String[] args) {
    long numIntro;
    int par;
    int suma;
    int longitud;
    long reves;
    
    par = 0;
    
    suma = 0;
    
    reves = 0;
    
    longitud = 0;
    
    System.out.println("Este programa te dice los digitos pares que haya en un numero que introduzcas y los suma");
    
    System.out.println("Introduce el numero");
    
    numIntro = Long.parseLong(System.console().readLine());
    
    while (numIntro>0) {
      reves = (reves * 10) + (numIntro%10);
      numIntro /=10;
      longitud++;
    }
    
    System.out.print("Los digitos pares de tu numero son :");
    
    for (int i = 0; i< longitud; i++){
      par = (int)(reves%10);
      if ((par % 2) == 0){
        System.out.print(par + " ");
        suma+=par;
      }
      reves /=10;
    }
    System.out.println();
    System.out.println(" La suma de los digitos pares de tu numero es: "+ suma);
    
  }
}
