// Faça um programa que imprima os números de 1 a 20, um por linha. Em seguida, imprima os mesmos números, mas todos na mesma linha, separados por um espaço.

public class Atvd06 
{
  public static void main(String[] args) 
  {
  for (int i = 1; i <= 20; i++) 
  {
    System.out.println(i);
  }
  StringBuilder output = new StringBuilder();
  for (int i = 1; i <= 20; i++) 
  {
    output.append(i).append(" ");
  }     System.out.println(output.toString().trim());
  }
}