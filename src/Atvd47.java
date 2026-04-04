// Faça um programa que receba o nome de um ginasta e as notas de 7 juízes. O programa deve calcular a média do atleta, eliminando a melhor e a pior nota, e exibir o resultado final.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atvd47 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Digite o nome do ginasta (ou digite 'fim' para encerrar):");
      String nome = scanner.nextLine();

      if (nome.equalsIgnoreCase("fim")) {
        break;
      }
      ArrayList<Double> notas = new ArrayList<>();

      for (int i = 1; i <= 7; i++) {
        System.out.print("Nota " + i + ": ");
        double nota = scanner.nextDouble();
        notas.add(nota);
      }
      Collections.sort(notas);

      double melhorNota = notas.get(6);
      double piorNota = notas.get(0);
      double somaNotas = 0;

      // Calcula a soma das notas excluindo a melhor e a pior
      for (int i = 1; i < 6; i++) {
        somaNotas += notas.get(i);
      }
      double mediaNotas = somaNotas / 5;

      System.out.println("\nResultado final:");
      System.out.println("Atleta: " + nome);
      System.out.println("Melhor nota: " + melhorNota);
      System.out.println("Pior nota: " + piorNota);
      System.out.printf("Média: %.2f%n%n", mediaNotas);

      scanner.nextLine(); // Limpa o buffer do scanner
    }
    scanner.close();
  }
}