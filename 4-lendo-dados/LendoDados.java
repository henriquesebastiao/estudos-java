import java.util.Scanner;

class LendoDados {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite seu nome completo: ");
    String nomeCompleto = scan.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = scan.nextInt();

    System.out.println("Seu nome completo: " + nomeCompleto);
    System.out.println("Sua idade: " + idade);
  }
}
