package com.henriquesebastiao.sequencial;

import java.util.Scanner;

public class Exercicio15 {
  /*
  Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
  8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

  - salário bruto.
  - quanto pagou ao INSS.
  - quanto pagou ao sindicato.
  - o salário líquido.
  - calcule os descontos e o salário líquido, conforme a tabela abaixo:

  + Salário Bruto : R$
  - IR (11%) : R$
  - INSS (8%) : R$
  - Sindicato ( 5%) : R$
  = Salário Líquido : R$

  Obs.: Salário Bruto - Descontos = Salário Líquido.

   */
  static void main() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Quanto voçê ganha por hora: ");
    double porHora = scan.nextDouble();
    System.out.print("Qual foi a quantidade de horas trabalhadas no mês: ");
    double horasTrabalhadas = scan.nextDouble();

    double salarioBruto = horasTrabalhadas * porHora;
    double impostoRenda = salarioBruto * 0.11;
    double inss = salarioBruto * 0.08;
    double sindicato = salarioBruto * 0.05;
    double salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);

    System.out.println("+ Salário Bruto : R$ " + salarioBruto);
    System.out.println("- IR (11%) : R$ " + impostoRenda);
    System.out.println("- INSS (8%): R$ " + inss);
    System.out.println("- Sindicato (5%): R$ " + sindicato);
    System.out.println("= Salário Líquido : R$ " + salarioLiquido);
  }
}
