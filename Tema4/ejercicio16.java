public class ejercicio16 {
  public static void main (String[] args) {
    int puntuacion;
    String respuesta1;
    String respuesta2;
    String respuesta3;
    String respuesta4;
    String respuesta5;
    String respuesta6;
    String respuesta7;
    String respuesta8;
    String respuesta9;
    String respuesta10;
    
    puntuacion = 0;
    
    System.out.println("Este programa es un cuestionario que te dice si tu pareja te es fiel o no");
    
    System.out.println("Responda con s/n");
    
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningun motivo aparente");
    
    respuesta1 = System.console().readLine();
    
    if (respuesta1.equals ("s")){
      puntuacion+=3 ;
    }
    
    System.out.println("Ha aumentado sus gastos de vestuario");
    
    respuesta2 = System.console().readLine();
    
    if (respuesta2.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Ha perdido interes que mostraba anteriormente por ti");
    
    respuesta3 = System.console().readLine();
    
    if (respuesta3.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Ahora se afeita(se arregla el pelo) y se asea con mas frecuencia");
    
    respuesta4 = System.console().readLine();
    
    if (respuesta4.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("No te deja que mires la agenda de su telefono movil");
    
    respuesta5 = System.console().readLine();
    
    if (respuesta5.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estas tu delante");
    
    respuesta6 = System.console().readLine();
    
    if (respuesta6.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Ultimamente se preocupa en cuidar la line y/o estar bronceado/a");
    
    respuesta7 = System.console().readLine();
    
    if (respuesta7.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo");
    
    respuesta8 = System.console().readLine();
    
    if (respuesta8.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Has notado que ultimamente se perfuma mas");
    
    respuesta9 = System.console().readLine();
    
    if (respuesta1.equals ("s")){
      puntuacion+=3 ;
    }
    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    
    respuesta10 = System.console().readLine();
    
    if (respuesta10.equals ("s")){
      puntuacion+=3 ;
    }
    
    if (puntuacion>=0 && puntuacion<=10){
      System.out.println("Enhorabuena! tu pareja parece ser totalmente fiel");
    }
    
    if (puntuacion>=11 && puntuacion<=22){
      System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. No bajes la guardia");
    }
    
    if (puntuacion>=23 ){
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco mas y averigües que es lo que esta pasando por su cabeza");
    }
  }
}
