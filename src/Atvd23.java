// Escreva um programa em Java que solicite ao usuário um número inteiro e determine se ele é um número primo ou não e exiba os números primos até esse valor e o número de divisões realizadas. Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.

import java.util.Scanner;

public class Atvd23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro N: ");
    int N = scanner.nextInt();
    int divisoes = 0;
    System.out.println("Números primos entre 1 e " + N + ":");
    for (int i = 2; i <= N; i++) {
      boolean ehPrimo = true;
      for (int j = 2; j <= i / 2; j++) {
        divisoes++;
        if (i % j == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        System.out.print(i + " ");
      }
    }
    System.out.println("\nNúmero total de divisões executadas: " + divisoes);

    scanner.close();
  }
}