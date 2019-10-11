//Alberto López Martín 1º DAW
public class ejercicio10 {
  public static void main (String[] args) {
    double nota;
    double sumaNotas;
    double media;
    int numerosIntroducidos;
    numerosIntroducidos = 0;
    
    sumaNotas = 0.0;
    
    nota = 0.0;
    
    System.out.println("Este programa calcula la media de las notas que introduzcas, para salir del programa escribe un numero negativo");
    
    do {
      System.out.println ("Escribe aqui tu nota");
      nota = Double.parseDouble(System.console().readLine());
      numerosIntroducidos++;
      sumaNotas = sumaNotas + nota;
    } while (nota>=0.0);
    sumaNotas-=nota;
    media = sumaNotas/(numerosIntroducidos-1);
    
    System.out.printf("La media de tus notas es: %.2f\n" ,media);
    
  }
}
