package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		

		Scanner num = new Scanner(System.in);
		
		System.out.println("Quantos reais você recebe por hora trabalhada?");
			double valorHora = num.nextDouble();
		System.out.println("Quantas horas trabalhadas no mês?");
			int horasTrab = num.nextInt();
			
			double totalMes = valorHora * horasTrab;
			
		System.out.printf("Você recebeu R$ %.2f.", totalMes);
		
		num.close();
    }
    }
