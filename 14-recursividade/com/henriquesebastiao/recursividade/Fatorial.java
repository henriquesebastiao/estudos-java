package com.henriquesebastiao.recursividade;

public class Fatorial {
  public static void main() {
    System.out.println("O fatorial de 5 é: " + fatorial(5));
  }

  public static int fatorial(int num) {
    if (num == 0) {
      return 1;
    }
    return num * fatorial(num - 1);
  }
}
