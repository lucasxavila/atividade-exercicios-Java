// Escreva um programa que leia um número inteiro positivo e imprima o número invertido. Por exemplo, se o usuário digitar 1234, o programa deve imprimir 4321.

import java.util.Scanner;

public class Atvd48 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro positivo: ");
    int numero = scanner.nextInt();

    if (numero < 0) {
      System.out.println("Por favor, digite um número inteiro positivo.");
      scanner.close();
      return;
    }
    int numeroInvertido = 0;

    while (numero > 0) {
      int digito = numero % 10;
      numeroInvertido = numeroInvertido * 10 + digito;
      numero /= 10;
    }
    System.out.println("Número invertido: " + numeroInvertido);

    scanner.close();
  }
}