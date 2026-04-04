// Escreva um programa em Java que gere a série de Fibonacci até que o valor seja maior que 500.

public class Atvd16 {
  public static void main(String[] args) {
    int primeiroTermo = 0;
    int segundoTermo = 1;
    int proximoTermo = primeiroTermo + segundoTermo;

    System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
    System.out.print(primeiroTermo + ", " + segundoTermo);

    while (proximoTermo <= 500) {
      System.out.print(", " + proximoTermo);
      primeiroTermo = segundoTermo;
      segundoTermo = proximoTermo;
      proximoTermo = primeiroTermo + segundoTermo;
    }
  }
}