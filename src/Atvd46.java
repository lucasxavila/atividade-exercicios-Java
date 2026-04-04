// Escreva um programa que leia o nome de um atleta e os cinco saltos realizados por ele. O programa deve calcular o melhor salto, o pior salto e a média dos demais saltos (removendo o melhor e o pior). O programa deve continuar lendo os dados de outros atletas até que o usuário digite "fim" como nome do atleta.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atvd46 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Double> saltos = new ArrayList<>();

    while (true) {
      System.out.println("Digite o nome do atleta (ou digite 'fim' para encerrar):");
      String nome = scanner.nextLine();

      if (nome.equalsIgnoreCase("fim")) {
        break;
      }
      System.out.println("Digite os cinco saltos do atleta " + nome + ":");
      
      for (int i = 1; i <= 5; i++) {
        System.out.print("Salto " + i + ": ");
        double salto = scanner.nextDouble();
        saltos.add(salto);
      }
      Collections.sort(saltos); // Ordena os saltos para encontrar o melhor e o pior
      double melhorSalto = saltos.get(4); // Melhor salto é o último após ordenação
      double piorSalto = saltos.get(0); // Pior salto é o primeiro após ordenação
      double somaSaltos = 0;
      
      // Calcula a soma dos três saltos restantes (removendo o melhor e o pior)
      for (int i = 1; i < 4; i++) {
        somaSaltos += saltos.get(i);
      }
      double mediaSaltos = somaSaltos / 3;

      System.out.println("\nResultado para o atleta " + nome + ":");
      System.out.println("Melhor salto: " + melhorSalto + " m");
      System.out.println("Pior salto: " + piorSalto + " m");
      System.out.println("Média dos demais saltos: " + mediaSaltos + " m");

      saltos.clear(); // Limpa a lista de saltos para o próximo atleta
      scanner.nextLine(); // Limpa o buffer do scanner
    }
    scanner.close();
  }
}