package com.henriquesebastiao.estatico;

public class CalculadoraEstatica {
  // A sobrecarga de métodos ocorre quando temos mais de um método com o mesmo nome na mesma classe,
  // porém a assinatura (número e/ou tipo de parâmetros) é diferente.
  public static int soma(int num1, int num2) {
    return num1 + num2;
  }

  public static int soma(int num1, int num2, int num3) {
    return num1 + num2 + num3;
  }

  public static double soma(double num1, double num2) {
    return num1 + num2;
  }

  // Variáveis e métodos estáticos podem ser acessados/usados sem instanciar a classe.
}
