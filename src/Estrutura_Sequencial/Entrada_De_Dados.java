package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_De_Dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		System.out.println("Renda: ");
		double renda = sc.nextDouble();
		
		System.out.printf("Olá %s, sua idade é %d anos, a renda é de R$ %.2f reais%n",nome,idade,renda);
		
				
		sc.close();
	}

}
