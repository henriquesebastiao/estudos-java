public class Continue {
  public static void main(String[] args) {
    int number = 0;

    while (number <= 10) {
      if (number == 5) {
        System.out.println("Pulamos o 5 hehe!!!");
        number = 6;
        continue;
      }

      System.out.println(number);

      number++;
    }
  }
}
