package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
			int N1 = num.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
			int N2 = num.nextInt();
			
		System.out.println("Digite um número real: ");
			int R = num.nextInt();
			
			System.out.println("A: "+(N1 * 2)+(N2 / 2));
			System.out.println("B: "+(N1 * 3) + R);
			System.out.println("C: "+ Math.pow(R, 3));
  }
}
