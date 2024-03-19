package Estrutura_Sequencial;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		System.out.println("Soma = " + soma);
		
		sc.close();
	}
}
