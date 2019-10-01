public class ejercicio10 {
  public static void main (String [] args) {
    int dia;
    int mes;
    
    System.out.println("Este programa te dice tu signo del zodiaco");
    
    System.out.println("Introduce el día en el que naciste en numero");
    
    dia = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe ahora el numero del mes en el que naciste");
    
    mes = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case 1:
      if (dia<=20) {
        System.out.println("Eres Capricornio");
      } else {
        System.out.println("Eres Acuario");
      }
      break;
      case 2:
      if (dia<=18) {
        System.out.println("Eres Acuario");
      } else {
        System.out.println("Eres Piscis");
      }
      break;
      case 3:
      if (dia<=20) {
        System.out.println("Eres Piscis");
      } else {
        System.out.println("Eres Aries");
      }
      break;
      case 4:
      if (dia<=21) {
        System.out.println("Eres Aries");
      } else {
        System.out.println("Eres Tauro");
      }
      break;
      case 5:
      if (dia<=20) {
        System.out.println("Eres Tauro");
      } else {
        System.out.println("Eres Geminis");
      }
      break;
      case 6:
      if (dia<=20) {
        System.out.println("Eres Geminis");
      } else {
        System.out.println("Eres Cancer");
      }
      break;
      case 7:
      if (dia<=22) {
        System.out.println("Eres Cancer");
      } else {
        System.out.println("Eres Leo");
      }
      break;
      case 8:
      if (dia<=23) {
        System.out.println("Eres Leo");
      } else {
        System.out.println("Eres Virgo");
      }
      break;
      case 9:
      if (dia<=23) {
        System.out.println("Eres Virgo");
      } else {
        System.out.println("Eres Libra");
      }
      break;
      case 10:
      if (dia<=22) {
        System.out.println("Eres Libra");
      } else {
        System.out.println("Eres Escorpio");
      }
      break;
      case 11:
      if (dia<=22) {
        System.out.println("Eres Escorpio");
      } else {
        System.out.println("Eres Sagitario");
      }
      break;
      case 12:
      if (dia<=21) {
        System.out.println("Eres Sagitario");
      } else {
        System.out.println("Eres Capricornio");
      }
      break;
    }
  }
  
}
