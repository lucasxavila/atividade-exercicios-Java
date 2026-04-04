// Faça um programa que calcule o tempo necessário para que o país A ultrapasse o país B em população, sabendo-se que a população do país A é de 80.000 habitantes com uma taxa de crescimento de 3% ao ano, enquanto a população do país B é de 200.000 habitantes com uma taxa de crescimento de 1,5% ao ano.

public class Atvd04 
{
  public static void main(String[] args) 
  {
    int paisA = 80000;
    int paisB = 200000;
    int anos = 0;

    while (paisA < paisB) {
      paisA += paisA * 0.03;
      paisB += paisB * 0.015;
      anos++;
    }
    System.out.println("O país A ultrapassará o país B em " + anos + " anos.");
  }
}