// Faça um programa que leia a quantidade de turmas e a quantidade de alunos em cada turma. Calcule e mostre a média de alunos por turma.

import java.util.Scanner;

public class Atvd27 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de turmas: ");
    int quantidadeTurmas = scanner.nextInt();
    if (quantidadeTurmas <= 0) {
      System.out.println("Número inválido de turmas.");
      scanner.close();
      return;
    }
    int totalAlunos = 0;
    for (int i = 1; i <= quantidadeTurmas; i++) {
      int quantidadeAlunos;
      do {
        System.out.print("Digite a quantidade de alunos para a turma " + i + ": ");
        quantidadeAlunos = scanner.nextInt();
        if (quantidadeAlunos <= 0 || quantidadeAlunos > 40) {
        System.out.println("Número inválido de alunos para a turma " + i + ". Deve ser entre 1 e 40.");
        }
      } while (quantidadeAlunos <= 0 || quantidadeAlunos > 40);
        
      totalAlunos += quantidadeAlunos;
    }
    double mediaAlunosPorTurma = (double) totalAlunos / quantidadeTurmas;
    System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);

    scanner.close();
  }
}