package exercicios;

import java.util.Scanner;

public class Doador {

	public static void main(String[] args) {

		int idade;
		String nome;
		boolean opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("Bem-vindo, digite seu nome : ");
		nome = leia.next();

		System.out.println("Digite sua idade : ");
		idade = leia.nextInt();

		System.out.println("Sua primeira vez doando sangue?Digite:(verdadeiro ou falso) ");
		opcao = leia.hasNext();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (opcao) {
					System.out.print("Infelizmente você não está  apto(a) a doar sangue...");
				} else {
					System.out.print("Parabéns você está apto(a) a doar  sangue !!! ");
				}

			} else {
				System.out.print("Parabéns você está apto(a) a doar sangue !!! ");
			}

		} else {
			System.out.print("Infelizmente você não está  apto(a) a doar sangue...");
		}
	}
}