// Faça um programa que imprima os números ímpares de 0 a 50.

public class Atvd09  
{
  public static void main(String[] args) 
  {
    for(int index = 0; index <= 50; index++){
      if (index%2!=0) {
        System.out.print(index + " ");
      }
    }
  } 
}