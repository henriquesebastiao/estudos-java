package com.henriquesebastiao.sequencial;

public class Exercicio13 {
  /*
  Tendo como dados de entrada um arquivo em Gigabytes, construa um algoritmo que faça a conversão para Megabytes e Kilobytes, usando as seguintes fórmulas:

  Para Kilobytes: Gigabytes * 1024 * 1024
  Para Megabytes: Gigabytes * 1024

  Responda o tamanho do arquivo em Megabytes e o tamanho em Kilobytes.
   */
  static void main() {
    double gigabytes = 64;
    System.out.println("Megabytes: " + toMegabytes(gigabytes));
    System.out.println("Kilobytes: " + toKilobytes(gigabytes));
  }

  public static double toMegabytes(double gigabytes) {
    return gigabytes * 1024;
  }

  public static double toKilobytes(double gigabytes) {
    return gigabytes * 1024 * 1024;
  }
}
