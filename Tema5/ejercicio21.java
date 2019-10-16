//Alberto López Martín 1º DAW
public class ejercicio21 {
  public static void main (String[] args) {
    int numIntro;
    int cantTot;
    int sumaImpar;
    int cantImpar;
    int parMax;
    
    cantTot = 0;
    sumaImpar = 0;
    cantImpar = 0;
    parMax = 0;
    
    
    System.out.println("Este programa te da la media de los numeros impares que introduzcas ,el mayor de los pares que introduzcas,");
    System.out.println("y cuantos hayas introducido, para salir del programa introduzca un numero negativo.");
    
    System.out.println("Introduce aqui los numeros");
    
    do{
      numIntro = Integer.parseInt(System.console().readLine());
      
      if (numIntro>=0){
        cantTot++;
        if ((numIntro%2) != 0){
          sumaImpar += numIntro;
          cantImpar++;
        } else {
          if (numIntro>parMax);
          parMax = numIntro;
        }
      }
    } while (numIntro>=0);
    
    System.out.println("La cantidad de numeros que has introducido son: "+ cantTot);
    System.out.println("La media de los numeros impares que has introducido son: " + (sumaImpar/cantImpar));
    System.out.println("El numero par mas grande que has introducido es: " + parMax); 
    
  }
}
