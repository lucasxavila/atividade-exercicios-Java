// Escreva um programa que solicite ao usuário um número inteiro e imprima todos os números primos entre 1 e esse número.

import java.util.Scanner;

public class Atvd35 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int limite = scanner.nextInt();
    System.out.println("Números primos entre 1 e " + limite + ":");

    for (int i = 2; i <= limite; i++) {
      boolean ehPrimo = true;
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          ehPrimo = false;
          break;
        }
      }
      if (ehPrimo) {
        System.out.print(i + " ");
      }
    }
    scanner.close();
  }
}