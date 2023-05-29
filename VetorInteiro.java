package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class VetorInteiro {

	public static void main(String[] args) {

		int[] vetorInteiros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número inteiro que deseja encontar : \n");
		int numero = leia.nextInt();


		for (numero = 0; numero < vetorInteiros.length; numero++) {
			System.out.println("O Número " + numero + " esta localizado na posição : " + vetorInteiros[numero]);

		}

		// retorna a posição certa
		int posicao = Arrays.binarySearch(vetorInteiros, numero);

		if (posicao >= 0)
			System.out.println("\nO número foi encontrado na Posição: " + posicao);
		else
			System.out.println("\nPosição não encontrado!");

	}

}
