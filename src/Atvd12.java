// Escreva um programa que solicite ao usuário um número inteiro entre 1 e 10 e exiba a tabuada desse número. O programa deve validar a entrada do usuário, garantindo que o número esteja dentro do intervalo especificado.

import java.util.Scanner;

public class Atvd12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;

    System.out.print("Insira um número de 1 a 10 para ver a tabuada: ");
    num = scanner.nextInt();

    while (num < 0 || num > 10){
      System.out.print("O número informado está fora do intervalo de 1 a 10.\nInsira um número de 1 a 10 para ver a tabuada: ");
      num = scanner.nextInt();
    }
    System.out.println("Tabuada do " + num);
    for (int index = 1; index <= 10; index++){
      System.out.println(num + " * " + index + " = " + (num*index));
    }
    scanner.close();
  }
}