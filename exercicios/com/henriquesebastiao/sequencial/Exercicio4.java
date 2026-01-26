package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio4 {
  public static void main() {
    // Faça um programa que peça as 4 notas bimestrais e mostre a média.

    double notas = 0;

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 4; i++) {
      System.out.print("Insira a nota: ");
      notas += scan.nextDouble();
    }

    System.out.println("Média: " + notas / 4);
  }
}
