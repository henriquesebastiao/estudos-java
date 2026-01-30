package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio14 {
  // João, um pescador, comprou um microcomputador para controlar
  // o rendimento diário de seu trabalho. Toda vez que ele traz um
  // peso de peixes maior que o estabelecido pelo regulamento de pesca
  // do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00
  // por quilo excedente. João precisa que você faça um programa que
  // leia a variável peso (peso de peixes) e calcule o excesso.
  // Gravar na variável excesso a quantidade de quilos além do limite e
  // na variável multa o valor da multa que João deverá pagar.
  // Imprima os dados do programa com as mensagens adequadas.

  static void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Informe a quantidade em quilos de peixes pescados: ");
    double peso = scan.nextDouble();

    if (peso > 50.0) {
      double excesso = peso - 50;
      double multa = excesso * 4;

      System.out.println("Quilos excedentes: " + excesso + " Kg");
      System.out.println("Multa: R$ " + multa);
    } else {
      System.out.println("O limite não foi excedido.");
    }
  }
}
