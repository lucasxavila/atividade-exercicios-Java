// Faça um programa que leia dois números inteiros e imprima a soma de todos os números entre eles (inclusive). Se os números forem iguais, imprima uma mensagem dizendo que eles são iguais.

import java.util.Scanner;

public class Atvd11 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int NumA, NumB, Soma = 0; 

    System.out.print("Digite o primeiro número: ");
    NumA = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    NumB = scanner.nextInt();

    if (NumA == NumB)
    {
      System.out.println("Os número são iguais");
    }
    else if(NumA < NumB)
    {
      for(int index = NumA; index <= NumB; index++){
        Soma = Soma + index;
        System.out.print(index + " + ");
      }
    }
    else
    {
      for(int index = NumA; index >= NumB; index--){
        Soma = Soma + index;
        System.out.print(index + " + ");
      }
    }
    System.out.println(" = "  + Soma);
    scanner.close();
  }
}