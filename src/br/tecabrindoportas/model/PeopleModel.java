package br.tecabrindoportas.model;

public class PeopleModel {
	
	private String firstName;
	private String lastName;
	private String cpf;
	private int idade;
	private String endereco;
	private double salario;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public PeopleModel() {
		super();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	@Override
	public String toString() {
		return "People [firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", cpf=" + cpf 
				+ ", idade=" + idade
				+ ", endereco=" + endereco + "]";
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public PeopleModel(String firstName, String lastName, String cpf, int idade, String endereco,double salario) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.salario = salario;
	}

}
