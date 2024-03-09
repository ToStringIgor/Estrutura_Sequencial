package Estrutura_Sequencial;

import java.util.Scanner;

public class Operadores_Aritimeticos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de A: ");
		int a = sc.nextInt();
		System.out.println("Valor de B: ");
		int b = sc.nextInt();
		
		int adicao = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		int divisao = a / b;
		int modulo = a % b;
		
		System.out.println("Valor Adição = " + adicao);
		System.out.println("Valor Subtração = " + subtracao);
		System.out.println("Valor Multiplicação = " + multiplicacao);
		System.out.println("Valor Divisão = " + divisao);
		System.out.println("Valor Resto(Mod) = " + modulo);
		
		sc.close();
	}

}
