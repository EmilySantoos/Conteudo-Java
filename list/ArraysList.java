package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysList {

	public static void main(String[] args) {
		ArrayList<String> cor = new ArrayList<String>();

		String cores = null;

		Scanner leia = new Scanner(System.in);

		for (int i = 1; i <= 5;i++) {
			System.out.print("Digite cinco cores de sua preferência:");
			cores = leia.next();
			cor.add(cores);
			//Adiciona as cores
		}
		
		System.out.println("\n Todas as cores  foram adicionada:" + cor );

		
		//ordena as colunas crescentes
		Collections.sort(cor);
		for (String color: cor) {
			System.out.println("\n A cor adicionada foi : "+ color);
		}//imprime as cores selecionadas e coloca em ordem
		
	
	}
}
