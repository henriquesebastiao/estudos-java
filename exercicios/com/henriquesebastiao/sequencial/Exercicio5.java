package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio5 {
  public static void main() {
    // Faça um programa que converta metros para centímetros.
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a quantidade em metros: ");
    double metros = scan.nextDouble();

    double centimetros = metros * 100;
    System.out.println("Centímetros: " + centimetros);
  }
}
