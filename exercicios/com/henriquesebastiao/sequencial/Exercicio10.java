package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio10 {
  /*
  Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
  Fórmula de conversão: F = (C * 9/5) + 32
   */

  static void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe a temperatura em Celsius: ");
    double celsius = scan.nextDouble();

    double fahrenheit = (celsius * (9.0 / 5.0)) + 32;
    System.out.println("Fahrenheit: " + fahrenheit);
  }
}
