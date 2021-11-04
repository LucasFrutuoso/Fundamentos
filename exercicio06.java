package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

        //A = PI * (R * R)
		
    Scanner num = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		System.out.println("Qual o raio? ");
			int R = num.nextInt();
		
			double A = Math.pow(R, 2) * PI;
		System.out.printf("Area: %.2f m2.", A);

  
  
  }
}
