package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio3 {
  // Faça um programa que peça dois números e imprima a soma.

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int num1 = scan.nextInt();

    System.out.print("Informe outro número: ");
    int num2 = scan.nextInt();

    int sum = num1 + num2;
    System.out.println(sum);
  }
}
