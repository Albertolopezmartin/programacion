public class ejercicio06 {
  public static void main (String[] args) {
    double h;
    double g;
    double t;
    
    System.out.println("Este programa te da el valor del tiempo que tarda en caer un objeto desde una altura");
    System.out.println("Introduzca el valor de la altura en metros: ");
    
    h = Double.parseDouble(System.console().readLine());
    
    g = 9.81;
    
    t =Math.sqrt(2*h/g);
    
    System.out.println(" El objeto tarda estos segundos en caer : "+ t);
    
  }
}
