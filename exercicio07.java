package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {		

      Scanner num = new Scanner(System.in);
		
    System.out.println("Digite o valor da altura do quadrado: ")
        int h = num.nextInt();
     System.out.println("Digite o valor da base do quadrado: ")
        int b = num.nextInt();
    
		System.out.printf("O dobro da área do quadrado é: %d", (b * h) * 2);
		
  }
}
