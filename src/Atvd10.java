// Faça um programa que leia dois números inteiros e imprima todos os números entre eles, inclusive os números digitados. O programa deve funcionar tanto para o caso de o primeiro número ser maior que o segundo, quanto para o caso de o segundo número ser maior que o primeiro.

import java.util.Scanner;

public class Atvd10 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int NumA, NumB; 

    System.out.print("Digite o primeiro número: ");
    NumA = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    NumB = scanner.nextInt();

    if (NumA == NumB)
    {
      System.out.print("Os número são iguais");
    }
    else if(NumA < NumB)
    {
      System.out.print("NumA e Menor: ");
      for(int index = NumA; index <= NumB; index++){
        System.out.print(index + " ");
      }
    }
    else
    {
      System.out.println("NumA e Maior: ");
      for(int index = NumA; index >= NumB; index--){
        System.out.print(index + " ");
      }
    }
    scanner.close();
  }
}