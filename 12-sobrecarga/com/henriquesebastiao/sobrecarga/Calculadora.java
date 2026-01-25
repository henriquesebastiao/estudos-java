package com.henriquesebastiao.sobrecarga;

public class Calculadora {
  // A sobrecarga de métodos ocorre quando temos mais de um método com o mesmo nome na mesma classe,
  // porém a assinatura (número e/ou tipo de parâmetros) é diferente.
  public int soma(int num1, int num2) {
    return num1 + num2;
  }

  public int soma(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public double soma(double num1, double num2) {
    return num1 + num2;
  }
}
