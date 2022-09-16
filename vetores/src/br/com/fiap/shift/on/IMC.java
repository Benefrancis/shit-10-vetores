package br.com.fiap.shift.on;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdPessoas = solicitarQuantidadeDePessoas(sc);

		float alturas[] = new float[qtdPessoas];

		float[] pesos = new float[qtdPessoas];

		double imc = 0;

		for (int i = 0; i < qtdPessoas; i++) {
			alturas[i] = solicitarAltura(sc, i);
			pesos[i] = solicitarPeso(sc, i);
		}

		for (int i = qtdPessoas; i > 0; i--) {
			imc = calcularIMC(pesos[i - 1], alturas[i - 1]);
			imprimir(imc, i);
		}
		sc.close();
	}

	private static void imprimir(double imc, int i) {
		System.out.printf("\nO IMC da " + i + "ª pessoa é: %.2f\n", imc);
	}

	private static int solicitarQuantidadeDePessoas(Scanner sc) {
		System.out.println("Por favor, informe a quantidade de pessoas: ");
		return sc.nextInt();
	}

	private static float solicitarPeso(Scanner sc, int i) {
		System.out.println("Por favor, informe o peso em Kg da  " + (i + 1) + "ª pessoa:  ");
		return sc.nextFloat();
	}

	private static float solicitarAltura(Scanner sc, int i) {
		System.out.println("Por favor, informe a altura da " + (i + 1) + "ª pessoa: ");
		return sc.nextFloat();
	}

	public static double calcularIMC(float peso, float altura) {
		return peso / Math.pow(altura, 2);
	}
}
