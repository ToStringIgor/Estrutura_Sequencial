package Estrutura_Sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor A: ");
		double a = sc.nextDouble();
		System.out.println("Valor B: ");
		double b = sc.nextDouble();
		System.out.println("Valor C: ");
		double c = sc.nextDouble();

		double triangulo = a * c / 2.0;
		double circulo = c * c * 3.14159;
		double trapezio = (a + b) * c / 2.0;
		double quadrado = b * b;
		double retangulo = a * b;

		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
