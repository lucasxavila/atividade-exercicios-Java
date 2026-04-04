// Faça um programa que leia e valide as seguintes informações:
// a. Nome: maior que 3 caracteres;
// b. Idade: entre 0 e 150;
// c. Salário: maior que 0;
// d. Sexo: 'f' ou 'm';
// e. Estado civil: 's', 'c', 'v' ou 'd';

import java.util.Scanner;

public class Atvd03 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    String nome = "";
    int idade = 0;
    double salario = 0;
    char sexo = ' ';
    char estadoCivil = ' ';

    System.out.print("Informe o nome do usuário (maior que 3 caracteres): ");
    do {
      if (scanner.hasNext()) {
        nome = scanner.nextLine();
        if (nome.length() < 3) {
          System.out.print("Nome inválido. Informe novamente: ");
        }
      }
    } while (nome.length() <= 3);
    
    System.out.print("Informe a idade do usuário (entre 0 e 150): ");
    do {
      if (scanner.hasNextInt()) {
        idade = scanner.nextInt();
        if (idade < 0 || idade > 150) {
          System.out.print("Valor inválido! Informe novamente a idade (entre 0 e 150): ");
        }
      }
    } while (idade < 0 || idade > 150);

    System.out.print("Informe o salário do usuário (maior que 0): ");
    do {
      if (scanner.hasNextDouble()) {
        salario = scanner.nextDouble();
        if (salario <= 0) {
          System.out.print("Valor inválido! Informe novamente o salário (maior que 0): ");
        }
      } 
      } while (salario <= 0);

    System.out.print("Informe o sexo do usuário (f ou m): ");
    do {
      if (scanner.hasNext()) {
        sexo = scanner.next().charAt(0);
        if (sexo != 'f' && sexo != 'm') {
          System.out.print("Valor inválido! Informe novamente o sexo (f ou m): ");
        }
      }
    } while (sexo != 'f' && sexo != 'm');

    System.out.print("Informe o estado civil do usuário (s, c, v ou d): ");
    do {
      if (scanner.hasNext()) {
        estadoCivil = scanner.next().charAt(0);
        if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
          System.out.print("Valor inválido! Informe novamente o estado civil (s, c, v ou d): ");
        }
      }
    } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

    System.out.printf("%s tem %d anos, ganha R$ %.2f e é do gênero %c, estado civil %c\n", nome, idade, salario, sexo, estadoCivil);
    scanner.close();
  }
}