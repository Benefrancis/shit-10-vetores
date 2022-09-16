package br.com.fiap.shift.on;

import java.util.Scanner;
/**
 * Calculando a média das notas
 * @author Francis
 *
 */
public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] notas = new int[4];

		float soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (i + 1) + "ª nota: ");
			notas[i] = sc.nextInt();
			soma += notas[i];
		}

		System.out.println("\nA média é: " + (soma / notas.length));
		sc.close();
	}
}
