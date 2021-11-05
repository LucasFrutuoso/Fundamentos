package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);	
		
		double h = 1.89;
		double pesoHomen = (72.7 * h) - 58;
		double pesoMulher = (62.1 * h) - 44.7;
		
		System.out.printf("Peso ideal é: %.2f Kg para homens e %.2f Kg para mulheres.", pesoHomen, pesoMulher);
		
		num.close();

		}
    }
