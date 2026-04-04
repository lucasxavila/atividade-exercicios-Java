// Faça um programa que leia a altura de 10 alunos e armazene-as em um vetor. Em seguida, determine e mostre a altura do aluno mais alto e do aluno mais baixo.

import java.util.Scanner;

public class Atvd39 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] Altura = new int[10];
    int[] Alunos = new int[10];
    int index = 0;
    int MBaixo = Integer.MAX_VALUE;
    int MAlto = Integer.MIN_VALUE; 
    int IA = 0, IB = 0;

    while (index < 10) {
      System.out.println("Digite o Numero do Aluno Nº" + (index + 1));
      Alunos[index] = scanner.nextInt();

      System.out.println("Digite sua Altura em centímetros");
      Altura[index] = scanner.nextInt();

      if (Altura[index] >= MAlto) {
        MAlto = Altura[index];
        IA = index;
      }
      if (Altura[index] <= MBaixo) {
        MBaixo = Altura[index];
        IB = index;
      }
      index++;
    }
    System.out.println("O aluno mais alto é o Nº " + Alunos[IA] + " com " + Altura[IA] + " centímetros.");
    System.out.println("O aluno mais baixo é o Nº " + Alunos[IB] + " com " + Altura[IB] + " centímetros.");

    scanner.close();
  }
}