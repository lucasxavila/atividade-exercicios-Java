// Em 1995, um funcionário de uma empresa recebeu um aumento salarial de 1,5% sobre o salário inicial. A partir de 1996, e a cada ano subsequente, ele recebeu um aumento igual ao dobro do percentual do ano anterior. Faça um programa que leia o salário inicial do funcionário e calcule o salário atual em 2024.

import java.util.Scanner;

public class Atvd38 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o salário inicial do funcionário: R$ ");
    double salarioInicial = scanner.nextDouble();

    int anoAtual = 2024;
    double percentualAumento = 0.015; // 1.5%

    for (int ano = 1996; ano <= anoAtual; ano++) {
      salarioInicial *= (1 + percentualAumento);
      percentualAumento *= 2;
    }
    System.out.println("O salário atual do funcionário em " + anoAtual + " é R$ " + salarioInicial);
    
    scanner.close();
  }
}