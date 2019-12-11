//Alberto López Martín 1ºDAW
import matematicas.Varias;

public class ejercicio19 {
  public static void main (String[] args) {
    String resultado = "";
    long numIntro;
    int opcion;
    String numIntroString;
    numIntro = 666;
    
    System.out.println("1- de Binario a Octal");
    System.out.println("2- de Binario a Decimal");
    System.out.println("3- de Binario a Hexadecimal");
    System.out.println("4- de Octal a Binario");
    System.out.println("5- de Octal a Decimal");
    System.out.println("6- de Octal a Hexadecimal");
    System.out.println("7- de Decimal a Binario");
    System.out.println("8- de Decimal a Octal");
    System.out.println("9- de Decimal a Hexadecimal");
    System.out.println("10- de Hexadecimal a Binario");
    System.out.println("11- de Hexadecimal a Decimal");
    System.out.println("12- de Hexadecimal a Octal");
    
    System.out.println("Elije una opcion");
    
    opcion = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe el numero a convertir");
    
    numIntroString = System.console().readLine();
    
    if (opcion < 10) {
      numIntro = Long.parseLong(numIntroString);
    }
    
    switch (opcion) {
      case 1:
      resultado = Long.toString(binarioAOctal(numIntro));
      break;
      case 2:
      resultado = Long.toString(binarioADecimal(numIntro));
      break;
      case 3:
      resultado = binarioAHexadecimal(numIntro);
      break;
      case 4:
      resultado = Long.toString(octalABinario(numIntro));
      break;
      case 5:
      resultado = Long.toString(binarioADecimal(octalABinario(numIntro)));
      break;
      case 6:
      resultado = binarioAHexadecimal(octalABinario(numIntro));
      break;
      case 7:
      resultado = Long.toString(decimalABinario(numIntro));
      break;
      case 8:
      resultado = Long.toString(binarioAOctal(decimalABinario(numIntro)));
      break;
      case 9:
      resultado = binarioAHexadecimal(decimalABinario(numIntro));
      break;
      case 10:
      resultado = Long.toString(hexadecimalABinario(numIntroString));
      break;
      case 11:
      resultado = Long.toString(binarioADecimal(hexadecimalABinario(numIntroString)));
      break;
      case 12:
      resultado = Long.toString(binarioAOctal(hexadecimalABinario(numIntroString)));
      break;
      default:
    }
    System.out.println(resultado);
  }
  public static long binarioAOctal (long binario) {
    long octal = 1;
    
    while (octal> 0) {
      octal = octal * 10 + (binarioADecimal(binario % 1000));
      binario = binario /1000;
    };
    
    octal = matematicas.Varias.pegaPorDetras(octal, 1);
    octal = matematicas.Varias.voltea(octal);
    octal = matematicas.Varias.quitaPorDetras(octal, 1);
    octal = matematicas.Varias.quitaPorDelante(octal, 1);
    
    return octal;
  }
  public static long binarioADecimal (long binario) {
    long decimal = 0;
    
    int bits = matematicas.Varias.digitos(binario);
    
    for (int i = 0; i < bits; i++){
      decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i); 
    }
    return decimal;
  }
  public static String binarioAHexadecimal (long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
    
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioADecimal(binario % 10000)) + hexadecimal;
      binario = binario/10000;
    };
    
    return hexadecimal;
  }
  public static long octalABinario (long octal) {
    long binario = 0;
    
    for (int i = 0;i < matematicas.Varias.digitos(octal); i++) {
      binario = binario * 1000 + decimalABinario(matematicas.Varias.digitoN(octal, i));
    }
    return binario;
  }
  public static long decimalABinario (long decimal) {
    if (decimal == 0){
      return 0;
    }
    
    long binario = 1;
    
    while (decimal >1){
      binario = matematicas.Varias.pegaPorDetras(binario, (int)decimal % 2);
      decimal = decimal/2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);
    
    return binario;
  }
  public static long hexadecimalABinario (String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
    
    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }
    return binario;
  }
}
