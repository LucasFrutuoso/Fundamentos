package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		Scanner num = new Scanner(System.in);
		
		System.out.println("Peso total: ");
		double peso = num.nextInt();
		
		double excesso = peso - 50;
		double multa = 4 * excesso;
		
		System.out.printf("João deverá pagar R$%.2f de multa. ", multa);
}
}
