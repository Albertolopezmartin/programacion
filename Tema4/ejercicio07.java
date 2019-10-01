public class ejercicio07 {
  public static void main (String[] args) {
    double nota1;
    double nota2;
    double nota3;
    double media;
    
    System.out.println("Este programa calcula la media de tres notas");
    
    System.out.println("Introduzca la primera nota");
    
    nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota");
    
    nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota");
    
    nota3 = Double.parseDouble(System.console().readLine());
    
    media = (nota1+ nota2 + nota3)/3;
    
    System.out.println("La media de tus notas es: " +media);
  }
}
