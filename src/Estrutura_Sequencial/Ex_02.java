package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da área do circulo: ");
		double circulo = sc.nextDouble();
		double pi = 3.14159;
		
		double area = circulo * circulo * pi;
		
		System.out.printf("A= %.4f", area);
		
		sc.close();
	}

}
