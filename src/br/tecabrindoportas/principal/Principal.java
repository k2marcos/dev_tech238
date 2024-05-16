package br.tecabrindoportas.principal;

import br.tecabrindoportas.controller.Funcoes;
import br.tecabrindoportas.model.PeopleModel;

public class Principal {

	public static void main(String[] args) {
		PeopleModel person = new PeopleModel();
		
		person.setFirstName("marcos");
		person.setLastName("feitosa");
		person.setCpf("07005315138");
		person.setEndereco("azul");
		person.setIdade(16);
		person.setSalario(2.000);
		
		System.out.println("Nome :" + person.getFirstName()
					     +"\nSobre Nome:" + person.getLastName()
					     +"\nCPF: " + person.getCpf()
					     +"\nEndereço: " + person.getEndereco()
					     +"\nIdade: " + person.getIdade()
					     +"\nSalario: " + person.getSalario()
		); 
		
		
		
		
		Funcoes func = new Funcoes();
		
		func.mediaAritimetica();
		
		
	}
}
