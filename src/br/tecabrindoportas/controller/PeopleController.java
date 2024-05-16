package br.tecabrindoportas.controller;

import javax.swing.JOptionPane;

import br.tecabrindoportas.model.PeopleModel;

public class PeopleController {
	
public void createPerson() {
	
	
	
		PeopleModel person = new PeopleModel();
		
		person.setFirstName("marcos");
		person.setLastName("feitosa");
		person.setCpf("07005315138");
		person.setEndereco("azul");
		person.setIdade(16);
		person.setSalario(2.000);
		
		JOptionPane.showMessageDialog(null, person);
		
		System.out.println(person.toString());
		
		System.out.println("Nome :" + person.getFirstName()
					     +"\nSobre Nome:" + person.getLastName()
					     +"\nCPF: " + person.getCpf()
					     +"\nEndereço: " + person.getEndereco()
					     +"\nIdade: " + person.getIdade()
					     +"\nSalario: " + person.getSalario()); 
	
	}
}
