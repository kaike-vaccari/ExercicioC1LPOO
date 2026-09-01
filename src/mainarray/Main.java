package mainarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Faça um programa que trabalhe com um ArrayList. O programa deverá
//		possuir um menu para permitir a execução das operações.
//		1 - Remover valores repetidos
//		2 - Remover valores maiores que X
//		3 - Contar ocorrência de um valor
//		4 - Intercalar duas listas
//		5 - Sair
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println(
					"Bem vindo ao nosso sitema. Selecione uma das opções abaixo:\n"+
							"1 - Remover valores repetidos\n"+
							"2 - Remover valores maires\n"+
							"3 - Contar ocorrência de um valor\n"+
							"4 - Intercalar duas listas\n"+
							"5 - Sair"
					);
			opcao = scan.nextInt();
		}while(opcao != 5);
		
		switch (opcao) {
		case 1:
			//removerRepetidos();
			break;
		case 2:
			//removerMaiores();
			break;
		case 3:
			//contarValor();
			break;
		case 4:
			//intercalarListas();
			break;
		case 5:
			System.out.println("Saindo do sistema...");
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida! Digite novamente");
			break;
		}
	}

}
