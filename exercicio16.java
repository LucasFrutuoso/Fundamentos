package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos metros serão pintados?");
		double M = sc.nextDouble();
		double MetrosLata = 18 * 3;
		double precoLata = 80;
		double latas =M /MetrosLata;
		
		System.out.printf("Você precisará de %.1f Lata(s). Preço total:R$ %.2f", latas, (M / MetrosLata) * precoLata);

		sc.close();

	}

}
