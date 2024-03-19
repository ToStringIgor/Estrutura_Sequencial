package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código da peça: ");
		sc.next();
		System.out.println("Digite o número de peças: ");
		int numPeca = sc.nextInt();
		System.out.println("Valor unitário da peça: ");
		double valorUni = sc.nextDouble();
		
		System.out.println("Digite o código da peça2: ");
		sc.next();
		System.out.println("Digite o número de peças2: ");
		int numPeca2 = sc.nextInt();
		System.out.println("Valor unitário da peça2: ");
		double valorUni2 = sc.nextDouble();
		
		double soma = numPeca * valorUni + numPeca2 * valorUni2;
		
		System.out.printf("Valor a Pagar = R$ %.2f " , soma);
		
		
		
		
		sc.close();
	}
}
