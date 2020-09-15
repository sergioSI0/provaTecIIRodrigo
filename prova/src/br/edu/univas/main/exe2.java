package br.edu.univas.main;

import java.util.Scanner;

public class exe2 {

		  public static void main(String[] args) {
				Scanner sc = new Scanner (System.in);
			    String troca;
			    int texto;
			    System.out.println("Informe o texto: ");
			    troca = sc.nextLine();
			    
			    texto = troca.length();
			    char[] arrayTemp = new char[texto];
			    char[] arrayCaractere = new char[texto];
			 
			    for (int i = 0; i < texto; i++) {
			    	arrayTemp[i] = troca.charAt(i);
			    }
			 
			    for (int j = 0; j < texto; j++) {
			      arrayCaractere[j] = arrayTemp[texto - 1 - j];
			    }
			 
			    String textoReverso = new String(arrayCaractere);
			    System.out.println(textoReverso);
			  
			    sc.close();
			  }

}