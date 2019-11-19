//Alberto López Martín 1ºDAW
public class ejercicio14 {
  public static void main (String[] args) {
    String [] palabraIntro;
    palabraIntro = new String [8];
    String [] colores = {
      "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
    };
    String [] colorIntro;
    colorIntro = new String [9];
    String [] palabras;
    palabras = new String [8];
    
    int j = 0;
    System.out.println("Introduce 8 palabras, si has introducido algun color, este se mostrara antes que las otras palabras que introduzcas");
    
    for (int i = 0; i<8; i++){
      System.out.print("Introduce la "+ i + " palabra: ");
      palabraIntro[i] = System.console().readLine();
      for (String c : colores){
        if (palabraIntro[i].equals(c)){
          palabras[j++] = c;
        }
      }
    }
    
    
    for (int i = 0; i<8; i++){
      boolean esColor = false;
      for (String c : colores) {
        if (palabraIntro[i].equals(c)) {
          esColor = true;
        }
      }
      if (!esColor) {
        palabras[j++] = palabraIntro[i];
      }
    }
    System.out.println();
    System.out.println("Las palabras que has introducido en el orden que han sido introducidas son:");
    for (int i = 0; i<8; i++){
      System.out.print("La palabra "+ i + " es: ");
      System.out.println(palabraIntro[i]);
    }
    
    System.out.println();
    System.out.println("Las palabras que has introducido con los colores primero son:");
    for (int i = 0; i<8; i++){
      System.out.print("La palabra "+ i + " es: ");
      System.out.println(palabras[i]);
    }
  }
}
