public class SwitchCase {
  public static void main(String[] args) {
    int day = 7;

    switch (day) {
      case 1:
        System.out.println("Segunda");
      case 2:
        System.out.println("Terca");
      case 3:
        System.out.println("Quarta");
      case 4:
        System.out.println("Quinta");
      case 5:
        System.out.println("Sexta");
      case 6:
        System.out.println("Sabado");
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("OXE!");
    }
  }
}
