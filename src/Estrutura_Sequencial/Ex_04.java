package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Número do funcionário: ");
		String numFun = sc.next();
		System.out.println("Horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Salário por horas: ");
		double salario = sc.nextDouble();
		
		double horasTra =  horas * salario;
		
		System.out.println("Funcionário = " + numFun);
		System.out.printf("Salário = U$ %.2f", horasTra);
		
		
		
		sc.close();
	}

}
