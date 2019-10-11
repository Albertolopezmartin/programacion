//Alberto López Martín 1º DAW
public class ejercicio13 {
  public static void main (String[] args) {
    int positivos;
    int negativos;
    
    positivos = 0;
    negativos = 0;
    
    System.out.println ("Este programa te dice cuantos numeros positivos y cuantos numeros negativos de los 10 numeros que introduzcas.");
    
    for (int i = 0; i < 10; i++) {
      if (Double.parseDouble(System.console().readLine()) > 0){
        positivos ++;
      } else {
        negativos ++;
      }
    }
    System.out.println ("Has puesto " + positivos + " positivos y " + negativos + " negativos");
    
  }
}
