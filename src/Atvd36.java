// Faça um programa que receba um número e o início e o fim de uma tabuada, e mostre a tabuada do número escolhido, começando pelo início e terminando no fim. Exemplo: se o número for 5, o início for 1 e o fim for 10, o programa deve mostrar a tabuada do 5 de 1 a 10.

import java.util.Scanner;

public class Atvd36 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Inicio, Fim, NumRef; 

    System.out.print("Qual número você deseja fazer a tabuada? ");
    NumRef = scanner.nextInt();
    System.out.print("Qual o número de início da tabuada? ");
    Inicio = scanner.nextInt();
    System.out.print("Qual o número de fim da tabuada? ");
    Fim = scanner.nextInt();

    if (Fim < Inicio) {
      System.out.println("Erro: O número de início deve ser menor que o de fim");
    } else {
      System.out.println("Vou montar a tabuada do " + NumRef + " começando do " + Inicio + " e terminando em " + Fim);
      for (int index = Inicio; index <= Fim; index++) {
      System.out.println(NumRef + " * " + index + " = " + (NumRef*index)  );
      }
    }
    scanner.close();
  }
}