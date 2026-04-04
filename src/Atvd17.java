// Escreva um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. O fatorial de um número n é o produto de todos os inteiros positivos menores ou iguais a n. Por exemplo, o fatorial de 5 (5!) é 5 * 4 * 3 * 2 * 1 = 120.

import java.util.Scanner;

public class Atvd17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num, resultado = 1; 
    System.out.print("Digite um número para calcular o seu fatorial: ");
    num = scanner.nextInt();

    for (int i = 1; i <= num; i++) {
      resultado *= i;
      if (i < num) {
        System.out.print(i + " * ");
      } else {
        System.out.print(i);
      }
    }
    System.out.println(" = " + resultado);
    scanner.close();
  }
}