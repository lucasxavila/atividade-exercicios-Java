// Faça um programa que leia um número N e depois leia N temperaturas. O programa deve mostrar a maior temperatura, a menor temperatura e a média das temperaturas digitadas.

import java.util.Scanner;

public class Atvd34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Num, index = 0;
    System.out.print("Quantas temperaturas serão informadas? ");
    Num = scanner.nextInt();
    Double[] Temp = new Double[Num];
    Double MenorTemp = Double.MAX_VALUE, MaiorTemp = 0.0, Soma = 0.0, Media = 0.0;

    while (index < Num) {
      System.out.print("Insira a " + (index + 1) + "º temperatura: ");
      Temp[index] = scanner.nextDouble();
      Soma += Temp[index];
      
        if (Temp[index] >= MaiorTemp) {
          MaiorTemp = Temp[index];
        }
        if (Temp[index] <= MenorTemp) {
          MenorTemp = Temp[index];
        }
        index++;
    }
    Media = Soma / Num;

    System.out.println("A maior temperatura digitada foi a de " + MaiorTemp + "º");
    System.out.println("A menor temperatura digitada foi a de " + MenorTemp + "º");
    System.out.println("A Média das temperaturas digitadas foi a de " + Media + "º");

    scanner.close();
  }
}