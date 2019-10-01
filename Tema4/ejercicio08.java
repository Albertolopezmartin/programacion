public class ejercicio08 {
  public static void main (String[] args) {
    double nota1;
    double nota2;
    double nota3;
    double media;
    
    System.out.println("Este programa calcula la media de tres notas y dice la nota de tu boletin.");
    
    System.out.println("Introduzca la primera nota");
    
    nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la segunda nota");
    
    nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca la tercera nota");
    
    nota3 = Double.parseDouble(System.console().readLine());
    
    media = (nota1+ nota2 + nota3)/3;
    
    System.out.println("La media de tus notas es: " +media);
    
    if (media<5) {
      System.out.println("Estas suspenso");
    } else {
      if (media==5) {
        System.out.println("Tienes un suficiente");
      
    } else {
      if (media==6) {
        System.out.println("Tienes un bien");
      
    } else {
      if (media>=7 && media<9) {
        System.out.println("Tienes un notable");
      
     } else {
       if (media>=9) {
         System.out.println("Tienes un sobresaliente");
       }
     }
   }
 }
}
     }
  }


