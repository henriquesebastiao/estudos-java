public class Carro {
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
}
