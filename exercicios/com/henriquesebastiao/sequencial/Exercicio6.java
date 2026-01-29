package com.henriquesebastiao.sequencial;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
  public static void main(){
    // Faça um programa que peça o raio de um círculo, calcule e mostre sua área.
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o raio do círculo: ");
    double raio = scan.nextDouble();

    double area = Math.PI * (raio * raio);
    System.out.println("Área: " + area);
  }
}
