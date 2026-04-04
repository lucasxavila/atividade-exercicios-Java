// Escreva um programa que solicite ao usuário um número inteiro entre 10 e 20 e exiba a tabuada desse número. O programa deve validar a entrada do usuário, garantindo que o número esteja dentro do intervalo especificado.

import java.util.Scanner;

public class Atvd13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    
    System.out.print("Insira um número de 10 a 20 para ver a tabuada: "); 
    num = scanner.nextInt();

    while (num < 10 || num > 20) {
      System.out.print("O número informado está fora do intervalo de 10 a 20.\nInsira um número de 10 a 20 para ver a tabuada: ");
      num = scanner.nextInt();
    }
    System.out.println("Tabuada do " + num);
    for (int index = 10; index <= 20; index++)
    {
      System.out.println(num + " * " + index + " = " + (num*index)  );
    }
    scanner.close();
  }
}