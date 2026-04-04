// Faça um programa que leia o número de CDs de uma coleção e o valor gasto em cada um deles. O programa deve calcular e mostrar o valor total investido na coleção e o valor médio gasto em cada CD.

import java.util.Scanner;

public class Atvd28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos CDs na coleção? ");
    int quantidadeCDs = scanner.nextInt();
    if (quantidadeCDs <= 0) {
      System.out.println("Número inválido de CDs.");
      scanner.close();
      return;
    }
    double totalInvestido = 0;
    for (int i = 1; i <= quantidadeCDs; i++) {
      System.out.print("Digite o valor do CD " + i + ": R$ ");
      double valorCD = scanner.nextDouble();
      if (valorCD <= 0) {
        System.out.println("Valor inválido para o CD " + i + ".");
        scanner.close();
        return;
      }
      totalInvestido += valorCD;
    }
    double valorMedioPorCD = totalInvestido / quantidadeCDs;
    System.out.println("Valor total investido na coleção: R$ " + totalInvestido);
    System.out.println("Valor médio gasto em cada CD: R$ " + valorMedioPorCD);
  
    scanner.close();
  }
}