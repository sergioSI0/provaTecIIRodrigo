package br.edu.univas.main;

import java.util.Scanner;

public class exe3 {

	public static void main(String[] args) { {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        String texto = "";
	        
	        System.out.println("Digite a palavra: ");
	        String nome = sc.nextLine();
	        for (int i = (nome.length() - 1);i >= 0; i--) {
	        	texto = texto + nome.charAt(i);
	        }
	        if (texto.toLowerCase().equals(nome.toLowerCase())) {
	            System.out.println("� pal�ndromo!");
	        } else {
	            System.out.println("N�o � pal�ndromo!");
	        }
	        sc.close();
	    }
	}
}
