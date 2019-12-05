//Alberto López Martín 1ºDAW
package matematicas;

/*Funciones matemáticas*/

public class Varias {
  /*Devuelve verdadero si el número que se pasa como parámetro
  es capicúa y falso en caso contrario.*/
  public static boolean esCapicua(long n) {
    return n == voltea(n);
  }

  public static boolean esCapicua(int n) {
  return esCapicua((long)n);
  }

  /*Devuelve verdadero si el número que se pasa como parámetro
  es primo y falso en caso contrario.*/
  public static boolean esPrimo(long n) {
    if (n < 2){
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean esPrimo(int n) {
    return esPrimo((long) n);
  }
  /*Devuelve el menor primo que es mayor al número que
  se pasa como parámetro.*/
  public static int siguientePrimo(int n) {
    while (!esPrimo(++n)) {};
    
    return (n);
  }
  
  /*Dada una base y un exponente, devuelve una potencia*/
  public static double potencia(int base, int exponente){
    if (exponente == 0) {
      return 1;
    }
    
    if (exponente < 0) {
      return 1/potencia(base , -exponente);
    }
    int n = 1;
    
    for (int i = 0; i < Math.abs(exponente);i++){
      n = n * base;
    }
    
    return n;
  }
  
  /*Cuenta el numero de dígitos de un numero entero*/
  public static int digitos (long n){
    if (n < 0) {
      n = -n;
    }
    
    if (n == 0) {
      return 1;
    } else {
      int x = 0;
      while (n > 0){
        n = n / 10;
        x++;
      }
      return x;
    }
  }
  
  public static int digitos(int n) {
    return digitos((long)n);
  }
  
  /*Le da la vuelta a un numero*/
  
  public static long voltea(long n) {
    if (n < 0){
      return -voltea(-n);
    }
    
    long volteado = 0;
    
    while (n > 0){
      volteado = (volteado*10)+ (n%10);
      n = n/10;
    }
    
    return volteado;
  }
  
  public static int voltea(int n) {
    return (int)voltea((long)n);
  }
  
  /*Devuelve el dígito que está en la posición n de un número entero.
  Se empieza contando por el 0 y de izquierda a derecha.*/
  
  public static int digitoN(long x, int n) {
    x = voltea(x);
    
    while (n-- > 0) {
      x = x/10;
    }
    
    return (int)x % 10;
  }
  
  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  }
  
  /*Da la posición de la primera ocurrencia de un dígito dentro de un número
  entero. Si no se encuentra, devuelve -1.*/
  
  public static int posicionDeDigito(long x, int d) {
    int i;
    
    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
    
    if (i == digitos(x)){
      return -1;
    } else {
      return i;
    }
  }
  
  public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
  }
  
  /*Le quita a un número n dígitos por detrás (por la derecha).*/
  
  public static long quitaPorDetras(long x, int n){
    return x/ (long)potencia(10, n);
  }
  
  public static int quitaPorDetras(int x, int n) {
    return (int)quitaPorDetras((long) x, n);
  }
  
  /*Le quita a un número n dígitos por delante (por la izquierda).*/
  
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }
  
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
  /*Añade un digito a un número por detrás (por la derecha).*/
  
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }
  
  public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
  }
  
  /*Añade un digito a un número por delante (por la izquierda).*/
  
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }
  
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }
  
  /*Toma como parámetros las posiciones inicial y final dentro de un número y
  devuelve el trozo correspondiente.*/
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
  
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }
  
  /*Pega dos numeros para formar uno solo*/
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }
  
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
}
