package br.edu.univas.main;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		int [] valor = lerNotas();
		adicionarInt(valor);
		contandoAlunos(valor);
	}



	private static int[] lerNotas() {
		Scanner ler = new Scanner(System.in);
		int[] valor =  new int[20];
		for(int i=0; i <valor.length; i= i+2 ) {
			System.out.println("Digite a nota: ");
			valor[i] = ler.nextInt();
		}
		
		ler.close();
		return valor;
	}
	private static void adicionarInt(int[] notas) {
		for(int i = 0; i<notas.length; i=i+2) {
			if(notas[i] >= 60) {
				notas[ i+1 ] = 1; 
			}else {
				notas[ i+1 ] = 0;
			}
		}
		
	}

	private static void contandoAlunos(int valor[]) {
		int cont = 0;
		for(int i = 1 ; i<valor.length  ; i=i+2) {
			
			if(valor[i]==1) {
				cont++;
			}
			
			
		}
		System.out.println("Os alunos aprovados são:" + cont);	
	}


}
