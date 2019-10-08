public class ejercicio04 {
  public static void main (String[] args) {
    int hora;
    float salario;
    
    System.out.println("Este programa calcula el salario de una semana. Escribe el numero de horas que trabajas a la semana:");
    hora = Integer.parseInt(System.console().readLine());
    if (hora<=40) {
      salario = hora * 12;
    } else {
      salario = 40 * 12 +((hora-40) * 16);
    }
    
    System.out.println( "Tu salario semanal es: "+ salario);
    
  }
}
