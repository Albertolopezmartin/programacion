//Alberto López Martín 1º DAW
public class ejercicio17 {
  public static void main (String[] args) {
    int numIntro;
    int suma;
    suma = 0;
    
    System.out.println("Este programa suma los 100 numeros siguientes al numero positivo que introduzcas");
    
    System.out.println("Introduce aqui el numero");
    numIntro = Integer.parseInt(System.console().readLine());
    
    if (numIntro<0){
      System.out.println("El numero es incorrecto, tienes que introducir un numero positivo");
    } else {
      for (int i = numIntro; i< (numIntro+100); i++){
        suma += i;
      }
    }
    System.out.println ("La suma es: " + suma);
  }
}
