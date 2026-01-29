package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio7 {
  // Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

  public static void main() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o lado do quadrado:");
    double lado = scan.nextDouble();

    double area = lado * lado;
     System.out.println("O dobro da área do quadrado é: " + area * 2);
  }
}
