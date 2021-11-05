package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

Scanner num = new Scanner(System.in);

		System.out.println("Nota 1:");
			double n1 = num.nextDouble();
    
		System.out.println("Nota 2:");
			double n2 = num.nextDouble();
    
		System.out.println("Nota 3:");
			double n3 = num.nextDouble();
    
		System.out.println("Nota 4:");
			double n4 = num.nextDouble();

		 double media = (n1 + n2 + n3 + n4) / 4;

		System.out.printf("%.1f", media);
		
		num.close();

}
}
