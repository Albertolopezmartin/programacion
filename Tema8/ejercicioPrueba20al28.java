//Alberto López Martín
import arrays.arraysuni;

public class ejercicioPrueba20al28 {
  public static void main(String[] args) {
    
    int [] a = arrays.arraysuni.generaArrayInt(20,0,100);
    
    arrays.arraysuni.muestraArrayInt(a);
    System.out.println("Mínimo: " + arrays.arraysuni.minimoArrayInt(a));
    System.out.println("Máximo: " + arrays.arraysuni.maximoArrayInt(a));
    System.out.println("Media: " + arrays.arraysuni.mediaArrayInt(a));
    
    if (arrays.arraysuni.estaEnArrayInt(a, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
    System.out.println("El 24 está en la posición " + arrays.arraysuni.posicionEnArrayInt(a, 24));
    System.out.print("Array al revés: ");
    arrays.arraysuni.muestraArrayInt(arrays.arraysuni.volteaArrayInt(a));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    arrays.arraysuni.muestraArrayInt(arrays.arraysuni.rotaDerechaArrayInt(a, 3));
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    arrays.arraysuni.muestraArrayInt(arrays.arraysuni.rotaIzquierdaArrayInt(a, 4));
    
  }
}
