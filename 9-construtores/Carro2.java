public class Carro2 {
  String marca;
  String modelo;
  int numPassageiros;
  double capCombustivel;
  double consumoCombustivel;

  public Carro2(
      String marca,
      String modelo,
      int numPassageiros,
      double capCombustivel,
      double consumoCombustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.numPassageiros = numPassageiros;
    this.capCombustivel = capCombustivel;
    this.consumoCombustivel = consumoCombustivel;
  }

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
