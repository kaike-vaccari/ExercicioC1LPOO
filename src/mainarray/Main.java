package mainarray;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	static Scanner scan = new Scanner(System.in); // precisa estar aqui para caso algum metodo precise solicitar ao usuario


	public static void main(String[] args) {
//		Faça um programa que trabalhe com um ArrayList. O programa deverá
//		possuir um menu para permitir a execução das operações.
//		1 - Remover valores repetidos
//		2 - Remover valores maiores que X
//		3 - Contar ocorrência de um valor
//		4 - Intercalar duas listas
//		5 - Sair
		//Scanner scan = new Scanner(System.in); TROCADO DE LUGAR
		
		
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		//Item 1
		System.out.println("Bem vindo, informe a quantidade de elementos da lista 1:");
		int num  = scan.nextInt();
				
		lista1 = preencher(num);
		System.out.println("valores incluidos na lista: " + lista1);
				
		lista2 = novaListaSemRepetido(lista1);
		System.out.println("valores da lista sem repetição: " + lista2);
		//FIM ITEM 1
		
		
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
	} // FIM MAIN
	
	//--------------------------------------------------------------
	
	
	
	private static ArrayList<Integer> novaListaSemRepetido(ArrayList<Integer> lista1) {
		ArrayList<Integer> novaLista = new ArrayList<>();
		
		for (int i=0; i < lista1.size();i++) {
			int valor = lista1.get(i);
			if(!valorExiste(novaLista, valor)) { // verifica se o valor ja esta na lista, se não estiver adiciona
				novaLista.add(lista1.get(i));
			}
		}
		
		
		return novaLista;
	}

	private static boolean valorExiste(ArrayList<Integer> lista, int valor) {// verifica se um valor existe em uma lista
		for (int i=0; i < lista.size();i++) {
			if(lista.get(i)== valor) {
				return true;
			}
		}
		return false;
	}

	private static ArrayList<Integer> preencher(int num) {
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i=0; i < num ; i++) { 
			int numGerado = (int)(Math.random()*20+1);
			lista.add(numGerado);
		}
		
		return lista;
	}
	

} // FIM CLASSE
