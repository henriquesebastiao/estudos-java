package com.henriquesebastiao.sequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio11 {
  /*
  Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:

    O produto do dobro do primeiro com metade do segundo.
    A soma do triplo do primeiro com o terceiro.
    O terceiro elevado ao cubo.
   */

  static void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe um numero inteiro: ");
    int int1 = scan.nextInt();

    System.out.print("Informe outro numero inteiro: ");
    int int2 = scan.nextInt();

    System.out.print("Informe um numero real: ");
    double real = scan.nextDouble();

    System.out.println("O produto do dobro do primeiro com metade do segundo: " + ((int1 * 2) * (int2 / 2)));
    System.out.println("A soma do triplo do primeiro com o terceiro: " + (int1 * 3) + real);
    System.out.println("O terceiro elevado ao cubo: " + Math.pow(real, 3.0));
  }
}
