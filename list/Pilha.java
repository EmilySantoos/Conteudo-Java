package list;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia =  new Scanner(System.in);
		
		String nomeLivro = null;
		int opcao;
		
		
		System.out.print(         "\n\t\t\t##--Livros  na Pilha--##\t\n"                       );
		System.out.print("\t| ---------------------------------------------------------------- |\n");
		System.out.print("\t|  Opção 1 -  deseja adicionar livros na pilha?                 |\n");
		System.out.print("\t|  Opção 2 - Listar todos os livros da pilha                    |\n");
		System.out.print("\t|  Opção 3 - Retirar livro da pilha                             |\n");
		System.out.print("\t|  Opção 0 - Sair                      		                |\n");
		System.out.print("\t| ---------------------------------------------------------------- |\n");
		System.out.print("\tEntre com a opção desejada: ");
		opcao = leia.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do livro que deseja atualizar: ");
				nomeLivro = leia.next();
				System.out.print(nomeLivro +" livro adicionado com sucesso!!\n "+ pilha.push(nomeLivro));
				break;

			case 2:
				System.out.println("\nLista de todos os livro da pilha\n"+ pilha+ nomeLivro);
				break;

			case 3:
				System.out.println("\nO livro retirado é:" + pilha.isEmpty());
				break;

			default:
				System.out.println("\nOpção Inválida!");
				break;

			case 0:
				System.out.println("\nAté logo,programa finalizado!");
			}

			}

	}

}
