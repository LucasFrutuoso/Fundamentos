package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		



// Fórmula conversão temp. --> (°F -32) x 5/9 = C°

				final int ajuste = 32;
				final int n1 = 5;
				final int n2 = 9;
				
				Scanner num = new Scanner(System.in);
				
				System.out.println("Fahrenheit: ");
				 double F = num.nextDouble();
				
				
				System.out.printf("%.2f C°", (F - ajuste) * n1/n2);
		
		num.close();
        }
        }
