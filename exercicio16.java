package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos metros serão pintados?");
		double M = sc.nextDouble();
		double litrosLata = 18;
		double precoLata = 80;
		double latas =M /litrosLata;
		
		System.out.printf("Você precisará de %.1f Lata(s). Preço total:R$ %.2f", latas, (M / litrosLata) * precoLata);

		sc.close();

	}

}
