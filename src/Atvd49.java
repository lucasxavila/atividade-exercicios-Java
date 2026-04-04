// Escreva um programa que calcule a soma da seguinte série: 1/1 + 2/3 + 3/5 + 4/7 + ... + n/m, onde n é o número de termos e m é o denominador que começa em 1 e aumenta de 2 em 2 a cada termo. O programa deve solicitar ao usuário o número de termos a serem calculados e exibir o resultado da soma.

import java.util.Scanner;

public class Atvd49 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int limite;
    double Res = 0, N = 1, M = 1;
    System.out.print("Digite um número para limitar o cálculo: ");
    limite = scanner.nextInt();
    for(int index = 1; index <= limite; index++){
      System.out.print(N+"/"+M+ " + ");
      Res += N/M;
      N = N + 1;
      M = M + 2;
    }
    System.out.println(" = " + Res);

    scanner.close();
  }
}