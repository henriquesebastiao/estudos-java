public class Break {
  public static void main(String[] args) {
    int number = 0;

    while (number <= 10) {
      System.out.println(number);

      if (number == 5) {
        System.out.println("Chegamos ao 5!!!");
        break;
      }

      number++;
    }
  }
}
