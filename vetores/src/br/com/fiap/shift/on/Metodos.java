package br.com.fiap.shift.on;

public class Metodos {

	public static void main(String[] args) {
		System.out.println(isPar(20));
	}

	public static double calcularIMC(float peso, float altura) {
		return peso / Math.pow(altura, 2);
	}

	public static boolean isPar(int numero) {
		return (numero % 2 == 0);
	}

}
