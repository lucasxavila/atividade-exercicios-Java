// Faça um programa para calcular o valor total de uma compra em uma loja. O programa deve solicitar o preço de cada produto e, quando o usuário digitar 0, o programa deve calcular e exibir o total da compra. Em seguida, o programa deve solicitar o valor em dinheiro recebido do cliente e calcular o troco a ser devolvido.

import java.util.Scanner;

public class Atvd32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contadorProduto = 1;
    double totalCompra = 0;

    System.out.println("Lojas Tabajara");
    while (true) {
      System.out.print("Produto " + contadorProduto + ": R$ ");
      double precoProduto = scanner.nextDouble();
      if (precoProduto == 0) {
        break;
      }
      totalCompra += precoProduto;
      contadorProduto++;
    }
    System.out.println("Total: R$ " + String.format("%.2f", totalCompra));

    System.out.print("Dinheiro: R$ ");
    double dinheiroRecebido = scanner.nextDouble();

    double troco = dinheiroRecebido - totalCompra;
    System.out.println("Troco: R$ " + String.format("%.2f", troco));

    scanner.close();
  }
}