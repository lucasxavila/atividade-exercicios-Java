// Escreva um programa em Java que solicite ao usuário um número inteiro n e gere a série de Fibonacci até o n-ésimo termo. A série de Fibonacci é definida como: F(0) = 0, F(1) = 1, e F(n) = F(n-1) + F(n-2) para n > 1.

import java.util.Scanner;

public class Atvd15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
    int n = scanner.nextInt();

    System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    scanner.close();
  }
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}