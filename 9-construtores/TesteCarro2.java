public class TesteCarro2 {
  public static void main(String[] args) {
    Carro2 van = new Carro2("Fiat", "Ducato", 10, 100, 0.2);

    System.out.println(van.marca);
    van.exibirAutonomia();
    System.out.println(van.getAutonomia());
    System.out.println(van.calculaCombustivel(10));
  }
}
