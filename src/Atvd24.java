// Faça um programa que leia N notas, calcule e mostre a média aritmética das notas lidas.

import java.util.Scanner;

public class Atvd24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantas notas você deseja inserir? ");
    int N = scanner.nextInt();
    if (N <= 0) {
      System.out.println("Número inválido de notas.");
      scanner.close();
      return;
    }
    double soma = 0;
    for (int i = 1; i <= N; i++) {
      System.out.print("Digite a nota " + i + ": ");
      double nota = scanner.nextDouble();
      soma += nota;
    }
    double media = soma / N;
    System.out.println("A média aritmética das " + N + " notas é: " + media);
    scanner.close();
  }
}