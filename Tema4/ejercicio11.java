public class ejercicio11 {
  public static void main (String [] args) {
    int hora;
    int minutos;
    int segundosTranscurridos;
    int segundosHastamedianoche;
    
    System.out.println ("Este programa pasa las horas y minutos que se introduzcan a segundos y dice lo que falta para llegar a medianoche");
    
    System.out.println("Introduzca la hora");
    hora = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca los minutos");
    minutos = Integer.parseInt(System.console().readLine());
    
    segundosTranscurridos = (hora*3600) + (minutos*60);
    
    segundosHastamedianoche = (24*3600) - segundosTranscurridos;
    
    System.out.println(" Los segundos que faltan para llegar a media noche son :" + segundosHastamedianoche);
  }
}
