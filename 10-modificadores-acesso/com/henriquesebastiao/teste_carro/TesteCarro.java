package com.henriquesebastiao.teste_carro;

import com.henriquesebastiao.carro.Carro;

public class TesteCarro {
  public static void main(String[] args) {
    Carro van = new Carro();
    van.marca = "Fiat";
    van.modelo = "Ducato";
    van.numPassageiros = 10;
    van.capCombustivel = 100;
    van.consumoCombustivel = 0.2;

    System.out.println(van.marca);
    van.exibirAutonomia();
    System.out.println(van.getAutonomia());
    System.out.println(van.calculaCombustivel(10));
  }
}
