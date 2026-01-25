package com.henriquesebastiao.encapsulamento.getter_setter;

public class GetterSetter {
  String marca;
  String modelo;
  int numPassageiros;
  double capCombustivel;
  double consumoCombustivel;

  // Método simples
  void exibirAutonomia() {
    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
  }

  // Método com retorno
  double getAutonomia() {
    return capCombustivel * consumoCombustivel;
  }

  // Método com parâmetros
  double calculaCombustivel(double km) {
    return km / consumoCombustivel;
  }

  // Getter
  public String getMarca() {
    return this.marca;
  }

  // Setter
  public void setMarca(String marca) {
    this.marca = marca;
  }
}
