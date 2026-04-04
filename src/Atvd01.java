// Faça um programa que leia uma nota entre 0 e 10. Se a nota for inválida, deve ser lida novamente até que seja válida.

import java.util.Scanner;

public class Atvd01 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int nota;

    do {
      System.out.print("Digite uma nota entre 0 e 10: ");
      nota = scanner.nextInt();
      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida");
      }
    } while (nota < 0 || nota > 10);
      
    System.out.println("Nota válida: " + nota);
    scanner.close();
  }
}
