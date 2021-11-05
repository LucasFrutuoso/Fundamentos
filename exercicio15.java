package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Quantos reais você recebe por hora trabalhada?");
			double valorHora = num.nextDouble();
		System.out.println("Quantas horas trabalhadas no mês?");
			int horasTrab = num.nextInt();
		
			
		double totalBruto = valorHora * horasTrab; 
		double impostoRenda = (totalBruto * 11) / 100;
		double INSS = (totalBruto * 8) / 100;
		double Sindicato = (totalBruto * 5) / 100;
		double totalLiquido = totalBruto - impostoRenda - INSS - Sindicato;
		
		
		System.out.printf("Salário Bruto: R$ %.2f\n", totalBruto);
		System.out.printf("INSS: R$ %.2f\n", INSS);
		System.out.printf("Sindicato: R$ %.2f\n", Sindicato);
		System.out.printf("Salário Liquido: R$ %.2f\n", totalLiquido);
		System.out.printf("Descontos: R$ %.2f\n", totalBruto - totalLiquido);
		
		
	}

}
