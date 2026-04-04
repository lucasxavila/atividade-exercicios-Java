// Faça um programa que receba as respostas de uma prova de múltipla escolha (A, B, C, D ou E) de vários alunos e compare com um gabarito pré-definido. O programa deve calcular o total de acertos de cada aluno, o maior e menor acerto entre os alunos, a média das notas da turma e o total de alunos que utilizaram o sistema.

import java.util.Scanner;

public class Atvd45 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String gabarito = "ABCDEEDCBA";
    int numQuestoes = gabarito.length();

    int totalAlunos = 0;
    int maiorAcerto = 0;
    int menorAcerto = numQuestoes;

    int totalAcertosTurma = 0;

    while (true) {
      System.out.println("Informe as respostas do aluno (A, B, C, D ou E), uma por linha:");

      int totalAcertosAluno = 0;

      for (int i = 0; i < numQuestoes; i++) {
        System.out.print("Resposta da questão " + (i + 1) + ": ");
        String resposta = scanner.next().toUpperCase();

        if (resposta.equals(String.valueOf(gabarito.charAt(i)))) {
          totalAcertosAluno++;
        }
      }
      if (totalAcertosAluno > maiorAcerto) {
        maiorAcerto = totalAcertosAluno;
      }
      if (totalAcertosAluno < menorAcerto) {
        menorAcerto = totalAcertosAluno;
      }
      totalAcertosTurma += totalAcertosAluno;
      totalAlunos++;
      
      System.out.println("Total de acertos do aluno: " + totalAcertosAluno);
      System.out.println("Deseja inserir as respostas de outro aluno? (S/N)");
      String continuar = scanner.next();

      if (!continuar.equalsIgnoreCase("S")) {
        break;
      }
    }
    double mediaNotasTurma = (double) totalAcertosTurma / totalAlunos;

    System.out.println("Maior acerto: " + maiorAcerto);
    System.out.println("Menor acerto: " + menorAcerto);
    System.out.println("Total de alunos que utilizaram o sistema: " + totalAlunos);
    System.out.println("Média das notas da turma: " + mediaNotasTurma);

    scanner.close();
  }
}