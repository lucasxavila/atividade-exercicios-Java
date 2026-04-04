// Faça um programa que leia 5 números, calcule e mostre a soma e a média dos números lidos.

import java.util.Scanner;

public class Atvd08
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int cont = 1;
    double soma = 0, media, num;

    while (cont <= 5){
      System.out.print("Digite o " + cont + "º número: ");
      num = scanner.nextDouble();
      soma = soma + num;
      cont++;
    }
    
    media = soma/5;
    
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    scanner.close();
  }
}