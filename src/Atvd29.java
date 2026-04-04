// A Loja Quase Dois vende uma variedade de produtos, mas o preço de cada produto é sempre R$ 1,99. 
// Faça um programa que mostre uma tabela de preços, listando os números de 1 a 50 e o preço correspondente de cada um desses números de produtos.

public class Atvd29 {
  public static void main(String[] args) {
    System.out.println("Lojas Quase Dois - Tabela de preços");
    for (int i = 1; i <= 50; i++) {
      double preco = i * 1.99;
      System.out.println(i + " - R$ " + String.format("%.2f", preco));
    }
  }
}