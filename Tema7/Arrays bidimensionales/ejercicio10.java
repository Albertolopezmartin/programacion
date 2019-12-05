//Alberto López Martín 1ºDAW
public class ejercicio10 {
  public static void main (String[] args) {
    String[][] tablero = new String [3][3];
    int x;
    int y;
    String JUGADOR1 = "X ";
    String JUGADOR2 = "O ";
    boolean jugador1Gana = false;
    boolean jugador2Gana = false;
    int cambioJugador = 0;
    
    System.out.println("TRES EN RAYA");
    for(x = 0; x < 3; x++) {
      for(y = 0; y < 3; y++) {
        tablero[x][y] = "  ";
      }
    }
    
    for(y = 2; y >= 0; y--) {
      System.out.print(y + "|");
      for(x = 0; x < 3; x++) {
          System.out.print(" ");
        }
      System.out.println();
    }
    System.out.println(" ----------\n  0  1  2\n");
    
    do {
      if (cambioJugador%2==0){
        System.out.println("Movimiento del jugador 1");
        System.out.print("Coordenada x: ");
        x = Integer.parseInt(System.console().readLine());
        System.out.print("Coordenada y: ");
        y = Integer.parseInt(System.console().readLine());
        tablero[x][y]= JUGADOR1;
        for(y = 2; y >= 0; y--) {
          System.out.print(y + "|");
          for(x = 0; x < 3; x++) {
            System.out.print(tablero[x][y]);
          }
        System.out.println();
        }
        System.out.println(" ----------\n  0  1  2\n");
      } else {
        System.out.println("Movimiento del jugador 2");
        System.out.print("Coordenada x: ");
        x = Integer.parseInt(System.console().readLine());
        System.out.print("Coordenada y: ");
        y = Integer.parseInt(System.console().readLine());
        tablero[x][y]=JUGADOR2;
        for(y = 2; y >= 0; y--) {
          System.out.print(y + "|");
          for(x = 0; x < 3; x++) {
            System.out.print(tablero[x][y]);
          }
        System.out.println();
        }
        System.out.println(" ----------\n  0  1  2\n");
      }
      jugador1Gana = (((tablero[0][0] == JUGADOR1) && (tablero[0][1] == JUGADOR1) && (tablero[0][2] == JUGADOR1))||((tablero[1][0] == JUGADOR1) && (tablero[1][1] == JUGADOR1) && (tablero[1][2] == JUGADOR1))||((tablero[2][0] == JUGADOR1) && (tablero[2][1] == JUGADOR1) && (tablero[2][2] == JUGADOR1))||((tablero[0][0] == JUGADOR1) && (tablero[1][0] == JUGADOR1) && (tablero[2][0] == JUGADOR1))||((tablero[0][1] == JUGADOR1) && (tablero[1][1] == JUGADOR1) && (tablero[2][1] == JUGADOR1))||(((tablero[0][2] == JUGADOR1) && (tablero[1][2] == JUGADOR1) && (tablero[2][2] == JUGADOR1))||((tablero[0][0] == JUGADOR1) && (tablero[1][1] == JUGADOR1) && (tablero[2][2] == JUGADOR1))||((tablero[0][2] == JUGADOR1) && (tablero[1][1] == JUGADOR1) && (tablero[2][0] == JUGADOR1))));
      jugador2Gana = (((tablero[0][0] == JUGADOR2) && (tablero[0][1] == JUGADOR2) && (tablero[0][2] == JUGADOR2))||((tablero[1][0] == JUGADOR2) && (tablero[1][1] == JUGADOR2) && (tablero[1][2] == JUGADOR2))||((tablero[2][0] == JUGADOR2) && (tablero[2][1] == JUGADOR2) && (tablero[2][2] == JUGADOR2))||((tablero[0][0] == JUGADOR2) && (tablero[1][0] == JUGADOR2) && (tablero[2][0] == JUGADOR2))||((tablero[0][1] == JUGADOR2) && (tablero[1][1] == JUGADOR2) && (tablero[2][1] == JUGADOR2))||(((tablero[0][2] == JUGADOR2) && (tablero[1][2] == JUGADOR2) && (tablero[2][2] == JUGADOR2))||((tablero[0][0] == JUGADOR2) && (tablero[1][1] == JUGADOR2) && (tablero[2][2] == JUGADOR2))||((tablero[0][2] == JUGADOR2) && (tablero[1][1] == JUGADOR2) && (tablero[2][0] == JUGADOR2))));
      if (jugador1Gana){
        System.out.println("Ha ganado el jugador 1!");
      }
      if (jugador2Gana){
        System.out.println("Ha ganado el jugador 2!");
      }
      cambioJugador++;
    } while ((!jugador1Gana)&&(!jugador2Gana));
  }
}
