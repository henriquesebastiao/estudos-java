package com.henriquesebastiao.carro;

// Para que eu possa usar a classe ou seus atributos e métodos em outros pacotes
// preciso defini-los como public, caso contrário serão visíveis apenas
// para classes dentro do mesmo pacote.

public class Carro {
  public String marca;
  public String modelo;
  public int numPassageiros;
  public double capCombustivel;
  public double consumoCombustivel;

  // Método simples
  public void exibirAutonomia() {
    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
  }

  // Método com retorno
  public double getAutonomia() {
    return capCombustivel * consumoCombustivel;
  }

  // Método com parâmetros
  public double calculaCombustivel(double km) {
    return km / consumoCombustivel;
  }
}
