//Alberto López Martín 1º DAW
public class ejercicio34 {
  public static void main (String[] args) {
    long numIntro1;
    long numIntro2;
    int par;
    int impar;
    long longitud;
    long reves1;
    long reves2;
    int digito;
    
    par = 0;
    
    impar = 0;
    
    reves1 = 0;
    
    longitud = 0;
    
    reves2 = 0;
    
    digito = 0;
    
    System.out.println("Este programa mezcla los digitos de dos numeros que introduzcas por teclado y desemboca en un numero compuesto por digitos pares y otro por impares");
    
    System.out.println("Escribe el primer numero");
    numIntro1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Escribe el segundo numero");
    numIntro2 = Integer.parseInt(System.console().readLine());
    
    while (numIntro1>0) {
      reves1 = (reves1 * 10) + (numIntro1%10);
      numIntro1 /=10;
      longitud++;
    }
    while (numIntro2>0) {
      reves2 = (reves2 * 10) + (numIntro2%10);
      numIntro2 /=10;
    }
    
    for (int i = 0; i < longitud; i++) {
      digito = (int)(reves1 % 10);
      if ((digito % 2) == 0) {
        par = par * 10 + digito;
        } else {
          impar = impar * 10 + digito;
      }
        digito = (int)(reves2 % 10);
        if ((digito % 2) == 0) {
          par = par * 10 + digito;
        } else {
          impar = impar * 10 + digito;
      }
      reves1 /= 10;
      reves2 /= 10;
    }
    
    System.out.println("El numero formado por los digitos pares es :"+ par);
    System.out.println("El numero formado por los digitos impares es :"+ impar);

  }
}
