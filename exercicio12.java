package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		Scanner num = new Scanner(System.in);	
		
		
		double A = 1.87;
		double pesoIdeal = (72.7 * A) - 58;
		
		System.out.printf("O peso ideal é: %.2f Kg.", pesoIdeal);
		
		num.close();
  }
}
