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
			
			switch (opcao) {
			case 1:
				removerRepetidos();
				break;
			case 2:
				removerMaiores();
				break;
			case 3:
				contarValor();
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
			
		}while(opcao != 5);
		
		
	} // FIM MAIN
	
	//--------------------------------------------------------------
	
	//CONTAR VALOR	 //ITEM 2
	private static void contarValor() {
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println("Informe a quantidade de elementos da lista:");
		int num  = scan.nextInt();
		lista = preencher(num);
		System.out.println("valores incluidos na lista: " + lista);
		
		
		System.out.println("Informe um valor para contar quantas vezes aparece: ");
		num  = scan.nextInt();
		
		int quant = contarValor(lista,num);
		
		System.out.println("O valor " + num + " aparece na lista: " + quant + " vezes.");
	}
	
	
	
	

	private static int contarValor(ArrayList<Integer> lista, int num) {
		int quant = 0;
		for (int i=0; i < lista.size();i++) {
				if(lista.get(i)== num) {
					quant++;
				}
			}
			return quant;
	}
	
	
	
	
	//REMOVER MAIORES //Item 2
		private static void removerMaiores() {
			ArrayList<Integer> lista = new ArrayList<>();
			
			
			System.out.println("Informe a quantidade de elementos da lista:");
			int num  = scan.nextInt();
			
			lista = preencher(num);
			System.out.println("valores incluidos na lista: " + lista);
			
			System.out.println("Informe um valor para remover da lista os maiores que ele: ");
			num  = scan.nextInt();
			
			while(valorMaiorExiste(lista,num)) { // pesquisa se existe valor maior.
				int pos = buscaPos(lista,num); // busca a posição do valor maior.
				lista.remove(pos); // remove o valor encontrado.
			}
			System.out.println("valores da lista menores que: " + num + " : " + lista); // exibe a lista novamente removendo os maiores que o num.
		}

		private static int buscaPos(ArrayList<Integer> lista, int num) {
			for (int i = 0; i < lista.size();i++) { // procura o valor maior e retorna a posição
				if (lista.get(i) > num) {
					return i;
				}
			}
			return 0;
		}

		private static boolean valorMaiorExiste(ArrayList<Integer> lista, int num) {
			for (int i=0; i < lista.size();i++) {
				if(lista.get(i) > num) {
					return true;
				}
			}
			return false;
		}
	
	
	//REMOVER REPETIDOS //Item 1
	private static void removerRepetidos() {
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		
		
		System.out.println("Bem vindo, informe a quantidade de elementos da lista 1:");
		int num  = scan.nextInt();
				
		lista1 = preencher(num);
		System.out.println("valores incluidos na lista: " + lista1);
				
		lista2 = novaListaSemRepetido(lista1);
		System.out.println("valores da lista sem repetição: " + lista2);
		//FIM ITEM 1
		
	}

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
