// Faça um programa que leia o código, a altura e o peso de um número indeterminado de clientes. O programa deve calcular e mostrar:
// a) O código e a altura do cliente mais alto;
// b) O código e a altura do cliente mais baixo;
// c) O código e o peso do cliente mais gordo;
// d) O código e o peso do cliente mais magro;
// e) A média das alturas dos clientes;
// f) A média dos pesos dos clientes;

import java.util.Scanner;

public class Atvd37 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int codigo;
    double altura, peso;
    int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
    double alturaMaisAlto = 0, alturaMaisBaixo = Double.MAX_VALUE;
    double pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
    double somaAlturas = 0, somaPesos = 0;
    int totalClientes = 0;

    while (true) {
      System.out.print("Digite o código do cliente (ou 0 para encerrar): ");
      codigo = scanner.nextInt();
      if (codigo == 0) {
        break;
      }
      System.out.print("Digite a altura do cliente (em metros): ");
      altura = scanner.nextDouble();
      System.out.print("Digite o peso do cliente (em quilos): ");
      peso = scanner.nextDouble();
      if (altura > alturaMaisAlto) {
        alturaMaisAlto = altura;
        codigoMaisAlto = codigo;
      }
      if (altura < alturaMaisBaixo) {
        alturaMaisBaixo = altura;
        codigoMaisBaixo = codigo;
      }
      if (peso > pesoMaisGordo) {
        pesoMaisGordo = peso;
        codigoMaisGordo = codigo;
      }
      if (peso < pesoMaisMagro) {
        pesoMaisMagro = peso;
        codigoMaisMagro = codigo;
      }
      somaAlturas += altura;
      somaPesos += peso;
      totalClientes++;
    }
    if (totalClientes > 0) {
      double mediaAlturas = somaAlturas / totalClientes;
      double mediaPesos = somaPesos / totalClientes;
      
      System.out.println("\nCliente mais alto:");
      System.out.println("Código: " + codigoMaisAlto);
      System.out.println("Altura: " + alturaMaisAlto + " metros");

      System.out.println("\nCliente mais baixo:");
      System.out.println("Código: " + codigoMaisBaixo);
      System.out.println("Altura: " + alturaMaisBaixo + " metros");

      System.out.println("\nCliente mais gordo:");
      System.out.println("Código: " + codigoMaisGordo);
      System.out.println("Peso: " + pesoMaisGordo + " quilos");

      System.out.println("\nCliente mais magro:");
      System.out.println("Código: " + codigoMaisMagro);
      System.out.println("Peso: " + pesoMaisMagro + " quilos");

      System.out.println("\nMédia das alturas dos clientes: " + mediaAlturas + " metros");
      System.out.println("Média dos pesos dos clientes: " + mediaPesos + " quilos");
    } else {
      System.out.println("\nNenhum cliente cadastrado.");
    }
    scanner.close();
  }
}