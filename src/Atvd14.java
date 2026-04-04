// Faça um programa que leia 10 números e informe se cada um é par ou ímpar.

import java.util.Scanner;

public class Atvd14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];
    
    for (int index = 0; index < 10; index++) {
      System.out.print("Digite o " + (index + 1) + "º Número: ");
      numeros[index] = scanner.nextInt();
    }
    for (int index = 0; index < 10; index++) {
      if (numeros[index] % 2 == 0) {
        System.out.println(numeros[index] + ": Par");
      } else {
        System.out.println(numeros[index] + ": Ímpar");
      }
    }
    scanner.close();
  }
}