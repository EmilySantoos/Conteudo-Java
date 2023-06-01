package list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<Integer>();
		Scanner leia = new Scanner(System.in); 
			int opcao;
			String nome; 

			System.out.print(         "\n\n\t##--Teste da Fila dos Clientes--##\t\n\n"                       );
			System.out.print("| ---------------------------------------------------------------- |\n");
			System.out.print("|  Opção 1 - Adicionar cliente na fila                             |\n");
			System.out.print("|  Opção 2 - Listar todos os cliente da fila                       |\n");
			System.out.print("|  Opção 3 - RetirarCliente da fila                      			 |\n");
			System.out.print("|  Opção 0 - Sair                           						 |\n");
			System.out.print("| ---------------------------------------------------------------- |\n");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			
			for (int i = 0; i <= 10; i++) {
			switch (opcao) {
			case 1:
				System.out.print("\nDigite seu nome: ");
				nome = leia.next();
				System.out.print(nome +" cliente adicionado(a) !!\n "+ fila.add(10));
				break;

			case 2:
				System.out.print("\nLista de todos os Clientes na fila\n"+ fila);
				break;

			case 3:
				System.out.print("\nChamando próximo cliente :" + fila.poll());
				break;

			default:
				System.out.print("\nOpção Inválida!");
				break;

			case 0:
				System.out.print("\nAté logo,programa finalizado!");
			}

			}
}
	}