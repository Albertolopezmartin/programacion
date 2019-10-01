public class ejercicio12 {
  public static void main (String [] args) {
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
    
    System.out.println("Este programa es un cuestionario que te dice como vas en la asignatura de programación");
    
    System.out.println("Responda con s/n");
    
    System.out.println("Primera pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta1 = System.console().readLine();
    
    if (respuesta1.equals ("s")){
      puntuacion++ ;
    }
    
    System.out.println("Segunda pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta2 = System.console().readLine();
    
    if (respuesta2.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Tercera pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta3 = System.console().readLine();
    
    if (respuesta3.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Cuarta pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta4 = System.console().readLine();
    
    if (respuesta4.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Quinta pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta5 = System.console().readLine();
    
    if (respuesta5.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Sexta pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta6 = System.console().readLine();
    
    if (respuesta6.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Septima pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta7 = System.console().readLine();
    
    if (respuesta7.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Octava pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta8 = System.console().readLine();
    
    if (respuesta8.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Novena pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta9 = System.console().readLine();
    
    if (respuesta1.equals ("s")){
      puntuacion++ ;
    }
    System.out.println("Decima pregunta: El 'public class' tiene que coincidir con el nombre del archivo?");
    
    respuesta10 = System.console().readLine();
    
    if (respuesta10.equals ("s")){
      puntuacion++ ;
    }
    
    System.out.println("Tu puntuación es :" + puntuacion);
     
    
  }
}
