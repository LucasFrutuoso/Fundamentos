package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Quantos metros? ");
		
    double Metros = num.nextDouble();
    double conversao = Metros * 100; //Conversão M para cm
    
		System.out.printf("%.0f cm.", conversao);
		
		num.close();
		
		}
    }
