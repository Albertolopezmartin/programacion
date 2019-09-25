/*GB,kB,B

Dada una cantidad en Bytes, conviértase a "forma compleja",
expresando su equivalencia en MB,kB, y B.

Ejemplo:

45896 B = ?? MB+ ¿¿kb + ### B
*/
public class practica {
  public static void main (String[] args) {
    int b;
    int mega;
    int kilo;
    int restokb;
    int restob;
    
    System.out.println("Escribe el numero de bytes: ");
    
    b = Integer.parseInt(System.console().readLine());
    
    kilo = b / 1024;
    mega =(b / 1024)/1024;
    restokb = kilo-(mega*1024);
    restob = b-(kilo*1024);
    
    System.out.println("La forma compleja es :" + mega + " Mbs " + restokb +" Kbs " + restob +" Bytes");
    
    
  }
  
}
