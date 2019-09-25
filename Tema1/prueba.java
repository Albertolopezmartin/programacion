/**
 * Comentario prueba
 * ln hace que se salte de línea = a \n
 * \033[34m hace que cambie el color
 * Esto es una prueba
 * casting: conversion forzada de tipo (float)
 */
public class prueba {
  public static void main (String[] args) {
    float numero1;
    float numero2;
    
    numero1 = (float)2.456;
    numero2 = (float)5.67541;
    
    float resultado;
    
    resultado = numero1 + numero2;
    
    System.out.print("Hola mundo.\n");
    System.out.println("\033[34mEsto es una prueba");
    //System.out.println("El resultado de la suma de "+numero1+" y "+numero2+" es:");
    System.out.printf("El resultado de la suma de %.2f y %.2f es:\n",numero1,numero2);
    //System.out.println(resultado);
    System.out.printf("%.2f",resultado);
  }
  
}
