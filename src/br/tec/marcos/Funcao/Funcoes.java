package br.tec.marcos.Funcao;

import java.util.Scanner;

public class Funcoes {

	public void mediaAritimetica() {
		int n1, n2, n3,n4, notar;
		float media, mediar;
		Scanner read = new Scanner(System.in);
		
		System.out.println("digite sua nota1: ");
		n1 = read.nextInt();
		
		System.out.println("digite sua nota2: ");
		n2 = read.nextInt();
		
		System.out.println("digite sua nota2: ");
		n3 = read.nextInt();
	
		System.out.println("digite sua nota2: ");
		n4 = read.nextInt();
		
		media =(n1+n2+n3+n4)/4;
		
		if (media >=7) {
			System.out.println("voce foi aprovado"+ media);
		}else {
				System.out.println("voce foi reprovado" + media);
				notar = read.nextInt();
			
				mediar = (media+notar)/2;
			if (mediar >= 5) {
				System.out.println("aluno aprovado com media em recuperação: "+ mediar);
			}else {
				System.out.println("Aluno reprovado com media: "+ mediar);
				}
		}
	}
}
