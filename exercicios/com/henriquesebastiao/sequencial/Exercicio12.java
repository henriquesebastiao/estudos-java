package com.henriquesebastiao.sequencial;

public class Exercicio12 {
  // Tendo como dados de entrada um arquivo em Gigabytes,
  // construa um algoritmo que faça a conversão para Megabytes,
  // usando a seguinte fórmula Gigabytes * 1024.

  static void main() {
     double gigabytes = 64;
     System.out.println("Megabytes: " + toMegabytes(gigabytes));
  }

  public static double toMegabytes(double gigabytes) {
    return gigabytes * 1024;
  }
}
