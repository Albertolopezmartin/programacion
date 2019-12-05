//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio16 {
  public static void main (String[] args) {
    long capicua = 0;
    
    System.out.println("Muestra todos los numeros capicua que hay entre el 1 y el 99999");
    
    for(long i = 0; i <= 99999; i++){
      if (matematicas.Varias.esCapicua(capicua)){
        System.out.printf("%10d",capicua);
      }
      capicua++;
    }
  }
}
