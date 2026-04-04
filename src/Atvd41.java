// Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atvd41 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##0.00");

    System.out.print("Digite o valor da dívida: R$ ");
    double divida = scanner.nextDouble();

    System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");
    System.out.println("---------------------------------------------------------------------------------");

    double valorJuros = 0;
    int[] parcelas = {1, 3, 6, 9, 12};

    for (int parcela : parcelas) {
      switch (parcela) {
        case 1:
          valorJuros = 0;
          break;
        case 3:
          valorJuros = divida * 0.10;
          break;
        case 6:
          valorJuros = divida * 0.15;
          break;
        case 9:
          valorJuros = divida * 0.20;
          break;
        case 12:
          valorJuros = divida * 0.25;
          break;
      }
      double valorParcela = (divida + valorJuros) / parcela;

      System.out.printf("R$ %-15s %-18s %-25s R$ %s\n", df.format(divida), df.format(valorJuros), parcela, df.format(valorParcela));
    }
    scanner.close();
  }
}