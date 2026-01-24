public class DoWhile {
  public static void main(String[] args) {
    int number = 0;

    // O do while executa o bloco de código pelo menos uma vez antes de verificar a condição
    do {
      System.out.println(number);
      number++;
    } while (number <= 10);
  }
}
