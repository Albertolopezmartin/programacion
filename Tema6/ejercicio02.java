//Alberto López Martín 1ºDAW
public class ejercicio02 {
  public static void main (String[] args) {
    int paloNum;
    String palo = "";
    int cartaNum;
    String carta = "";
    
    System.out.println("Este programa muestra al azar el nombre de una carta de la baraja francesa");
    
    paloNum = (int) (Math.random()*4)+1;
    switch (paloNum){
      case 1:
      palo = "picas";
      break;
      case 2:
      palo = "corazones";
      break;
      case 3:
      palo = "diamantes";
      break;
      case 4:
      palo = "treboles";
      break;
      default:
    }
    cartaNum = (int) (Math.random()*13)+1;
    switch (cartaNum){
      case 1:
      carta = "A";
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      carta = ""+ cartaNum;
      break;
      case 11:
      carta = "J";
      break;
      case 12:
      carta = "Q";
      break;
      case 13:
      carta = "K";
      break;
      default:
    }
    System.out.println("La carta que ha salido es: "+ palo +" " +carta);
  }
}
