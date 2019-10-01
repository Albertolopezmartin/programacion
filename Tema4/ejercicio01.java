public class ejercicio01 {
  public static void main (String[] args){
    String diaSemana;
    
    System.out.print("Escribe el día de la semana que quieras saber la primera hora de clase: ");
    diaSemana = System.console().readLine();
    switch (diaSemana) {
      case "lunes":
        System.out.println("A primera toca Entornos de desarrollo");
        break;
      case "martes":
        System.out.println("A primera toca Programacion");
        break;
      case "miercoles":
        System.out.println("A primera toca Programacion");
        break;
      case "jueves":
        System.out.println("A primera toca Programacion");
        break;
      case "viernes":
        System.out.println("A primera toca FOL");
        break;
      }
  }
}
