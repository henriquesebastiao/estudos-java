package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio9 {
  /*
  * Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
  * Fórmula de conversão: C = 5 * ((F-32) / 9)
  */

  public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Insira a temperatura em Fahrenheit:");
    double fahrenheit = scan.nextDouble();
    double celsius = 5 * ((fahrenheit-32) / 9);
    System.out.println(celsius);
  }
}
