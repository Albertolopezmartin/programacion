//Alberto López Martín 1ºDAW
public class ejercicio03 {
  public static void main (String[] args) {
    int paloNum;
    String palo = "";
    int cartaNum;
    String carta = "";
    
    System.out.println("Este programa muestra al azar el nombre de una carta de la baraja española");
    
    paloNum = (int) (Math.random()*4)+1;
    switch (paloNum){
      case 1:
      palo = "Espadas";
      break;
      case 2:
      palo = "Bastos";
      break;
      case 3:
      palo = "Copas";
      break;
      case 4:
      palo = "Oros";
      break;
      default:
    }
    cartaNum = (int) (Math.random()*10)+1;
    switch (cartaNum){
      case 1:
      carta = "As";
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      carta = ""+ cartaNum;
      break;
      case 8:
      carta = "Sota";
      break;
      case 9:
      carta = "Caballo";
      break;
      case 10:
      carta = "Rey";
      break;
      default:
    }
    System.out.println("La carta que ha salido es: "+ palo +" " +carta);
  }
}
