package br.tec.marcos.principal;

import java.util.Scanner;

public class questaoA {

	public static void main(String[] args) {


		int idade;
		String nome,sexo,pais;
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("qual o seu nome?");
		nome = read.next();
		
		System.out.println("para qual pais voce vai?");
		pais = read.next();
		
		System.out.println("qual o seu sexo M/F?");
		sexo = read.next();
		
		System.out.println(" qual sua idade?");
		idade= read.nextInt();
		
		if (idade >= 18){
		
			System.out.println(nome +", boa viagem para "+ pais);
					
		} else {
			System.out.println(nome +" voce e menor de idade, não pode viajar!");
		}
		
		
		
		
		
	}

}
