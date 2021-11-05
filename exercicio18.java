package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Tamanho do arquivo para download:(em MegaBytes) ");
			double MB = sc.nextDouble();
		System.out.println("Qual a velocidade da conexão (em Megabits) ?");
			double Mb = sc.nextDouble();
			
			double tempo = MB / (Mb/ 8);
			
			
			System.out.printf("Restam %.2f segundos", tempo);

		sc.close();

	}

}
