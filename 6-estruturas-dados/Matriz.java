public class Matriz {
  public static void main() {
    // Matrizes são arrays multidimensionais
    double[][] notas = new double[10][4];

    for (int aluno = 0; aluno != 10; aluno++) {
      notas[aluno][0] = 6.8;
      notas[aluno][1] = 8.9;
      notas[aluno][2] = 10.0;
      notas[aluno][3] = 9.5;
    }

    for (int aluno = 0; aluno != 10; aluno++) {
      System.out.println("Notas do aluno " + aluno + ":");
      for (int nota = 0; nota <= 3; nota++) {
        System.out.println(notas[aluno][nota]);
      }
    }
  }
}
