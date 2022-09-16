package br.com.fiap.shift.on;

import java.util.Scanner;

/**
 * Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada
 * informação no seu respectivo vetor. Imprima a idade e a altura na ordem
 * inversa a ordem lida.
 * 
 * @author Francis
 *
 */
public class IdadeAltura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe a quantidade de pessoas: ");
		int qtdPessoas = sc.nextInt();

		byte[] idades = new byte[qtdPessoas]; // 127

		float alturas[] = new float[qtdPessoas];

		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Por favor, informe a idade da " + (i + 1) + "ª pessoa: ");
			idades[i] = sc.nextByte();
			System.out.println("Por favor, informe a altura da  " + (i + 1) + "ª pessoa:  ");
			if (sc.hasNextFloat()) {
				alturas[i] = sc.nextFloat();
			}
		}

		for (int i = qtdPessoas; i > 0; i--) {
			System.out.println("A " + i + "ª pessoa tem " + idades[i - 1] + " de idade e mede " + alturas[i - 1] + " de altura.");
		}
		
		sc.close();
	}
}
