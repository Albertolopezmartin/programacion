//Alberto López Martín 1º DAW
public class ejercicio23 {
  public static void main (String[] args) {
    int numIntro;
    int cantNum;
    int suma;
    
    cantNum = 0;
    suma = 0;
    
    System.out.println("Este programa permite que se le introduzcan numeros mientras estos no den una suma mayor a 10000, cuando el total llegue a 10000, el programa mostrara la media de los numeros introducidos, el total acumulado y cuantos numeros se han introducido");
    
    System.out.println("Escribe aqui los numeros");
    
    do{
      numIntro = Integer.parseInt(System.console().readLine());
        cantNum++;
        suma += numIntro;
    } while (suma<=10000);
    
    System.out.println("---------");
    System.out.println("Has introducido " + cantNum + " numeros");
    System.out.println("La suma total de los numeros que has introducidos es : "+ suma);
    System.out.println("La media de los numeros introducidos es:" + (suma/cantNum));
  }
}
