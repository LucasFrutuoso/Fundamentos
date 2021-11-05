package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		// Fórmula conversão temp. --> (°C × 9/5) + 32 = °F

		Scanner num = new Scanner(System.in);

		final int ajuste = 32;
		final int n1 = 5;
		final int n2 = 9;
		
		System.out.println("Celsius: ");
		    double C = num.nextDouble();
		
		 System.out.printf("%.2f F°", (C * n2/n1) + ajuste);
		
		num.close();
  }
}
