public class ejercicio8 {
  public static void main (String[] args) {
    int hora;
    
    System.out.println("Este programa calcula el salario de una semana a cuenta de 12 euros la hora. Escribe el numero de horas que trabajas al día:");
    hora = Integer.parseInt(System.console().readLine());
    
    float salario= hora * 5 * 12;
    
    System.out.println( "Tu salario semanal es: "+ salario);
    
  }
  
}
