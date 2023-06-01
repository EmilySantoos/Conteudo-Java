package list;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroInteiro {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<Integer>();

		Integer i = Integer.valueOf(2);

		Scanner leia = new Scanner(System.in);

		numero.add(i);
		numero.add(5);
		numero.add(1);
		numero.add(3);
		numero.add(4);
		numero.add(9);
		numero.add(7);
		numero.add(8);
		numero.add(10);
		numero.add(6);

		/**
		 * Mostra na tela todas as numero através do laço For...Each.
		 */
		System.out.println("\nOs números cadastrados são :" + numero);

		System.out.println("\nDigite um número inteiro,é verificaremos em qual posição está: ");
		int numeroo = leia.nextInt();

			{
				System.out.println("\n O numero está na posição: " + numero.indexOf(numeroo));
			
				System.out.println("\n O número " + numeroo + " digitado não foi encontrado ");
			}
		

	}

}
