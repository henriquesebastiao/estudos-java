public class ForEach {
  public static void main(String[] args) {
    double[] temperaturas = new double[5];
    // No Java é necessário passar a quantidade de elementos que o array irá conter ao criá-lo

    temperaturas[0] = 33.6;
    temperaturas[1] = 32.0;
    temperaturas[2] = 33.2;
    temperaturas[3] = 31.2;
    temperaturas[4] = 30.9;

    System.out.println("A temperatura do dia um é: " + temperaturas[0]);
    System.out.println("Tamanho do array: " + temperaturas.length);

    // For each
    for (double temperatura : temperaturas) {
      System.out.println("Temperatura: " + temperatura);
    }
  }
}
