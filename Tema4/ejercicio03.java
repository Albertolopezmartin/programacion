public class ejercicio03 {
  public static void main (String[] args) {
    int dia;
    System.out.print("Indica un numero del 1-7: ");
    dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      case 1:
        System.out.println("Hoy es lunes");
        break;
      case 2:
        System.out.println("Hoy es martes");
        break;
      case 3:
        System.out.println("Hoy es miercoles");
        break;
      case 4:
        System.out.println("Hoy es jueves");
        break;
      case 5:
        System.out.println("Hoy es viernes");
        break;
      case 6:
        System.out.println("Hoy es sabado");
        break;
      case 7:
        System.out.println("Hoy es domingo");
        break;
      }
  }
}
