package br.com.fiap.shift.on;

import java.util.Random;

public class Copia {

	public static void main(String[] args) {

		Random r = new Random();

		// Declarando e iniciando o primeiro vetor.
		int vetorA[] = new int[5];
		// Declarando e iniciando o segundo vetor com o mesmo tamanho do primeiro vetor
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = r.nextInt(10);
		}

		vetorB = vetorA.clone();

		System.out.println("\nValores do vetor A: ");

		for (int a : vetorA) {
			System.out.print(" [" + a + "] ");
		}

		System.out.println("\nValores do vetor B: ");
		for (int b : vetorB) {
			System.out.print(" [" + b + "] ");
		}
	}
}

