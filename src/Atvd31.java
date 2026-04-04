// Faça um programa que leia uma nota entre 0 e 10. Se a nota for inválida, deve ser solicitado que o usuário digite novamente até que seja informada uma nota válida.

import java.util.Scanner;

public class Atvd31 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Num; 

    System.out.print("Digite uma nota entre 0 e 10: ");
    Num = scanner.nextInt();
    while (Num < 0 || Num > 10){
      System.out.print("Nota inválida, Digite uma nota entre (0-10): ");
      Num = scanner.nextInt();
    }
    System.out.println("Nota válida");

    scanner.close();
  }
}