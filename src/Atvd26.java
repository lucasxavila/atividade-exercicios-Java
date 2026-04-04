// Em uma eleição presidencial existem três candidatos. O número total de eleitores é informado pelo usuário, assim como o voto de cada eleitor (um número correspondente a cada candidato). Faça um programa que calcule e mostre o número de votos de cada candidato, o número de votos nulos e brancos, e quem venceu a eleição. 

import java.util.Scanner;

public class Atvd26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Bolsonaro=0, Lula=0, Ciro=0, NumElei, Voto=0, Invalidos =0; 
    // String CanA = "Bolsonaro", CanB = "Lula", CanC = "Ciro";
    System.out.print("Qual o número de eleitores? ");
    NumElei = scanner.nextInt();
    System.out.println("Bolsonaro = 22, Lula = 13, Ciro = 23");
    for(int index = 1; index <= NumElei; index++)
    {
      System.out.print("Voto Eleitor Nº" + index + ": ");
      Voto = scanner.nextInt();
      if (Voto == 22) {
        Bolsonaro++;
      } else if (Voto == 13)
      {
        Lula++;
      } else if (Voto == 23) {
        Ciro++;
      } else {
        Invalidos++;
        System.out.println("Voto não computado, número inválido");
      }
    }

    if (Bolsonaro > Lula) {
      if (Bolsonaro > Ciro) {
        System.out.println("Bolsonaro Foi Eleito com " + Bolsonaro + " votos");
      }
      else {
        System.out.println("Ciro foi eleito com "+ Ciro + " votos");
      }
    }
    else
    {
      System.out.println("Lula foi eleito com "+ Lula + " votos");
    }
    System.out.println("Bolsonaro " + Bolsonaro + " Votos");
    System.out.println("Lula " + Lula + " Votos");
    System.out.println("Ciro " + Ciro + " Votos");
    System.out.println("Total de " + Invalidos + " Votos Inválidos");

    scanner.close();
  }
}