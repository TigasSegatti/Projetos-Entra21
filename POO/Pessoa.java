package bercarioDevJava;

import java.util.Date;

public abstract class Pessoa {

	private String nomeCompleto;
	private String endereco;
	private Date dataNascimento;
	
	public Pessoa() {
		
	}
 public Pessoa(String nomeCompleto, String endereco, Date dataNascimento) {
	this.nomeCompleto= nomeCompleto;
	this.endereco= endereco;
	this.dataNascimento= dataNascimento;
	

}
 public String getNomeCompleto() {
	 return this.nomeCompleto;
 }
 public String getEndereco() {
	 return this.endereco;
 }
 
 public Date getDataNascimento() {
	 return this.dataNascimento;
 }
 
 public void setNomeCompleto(String nomeCompleto) {
	this.nomeCompleto= nomeCompleto;
 }
 public void setEndereco(String endereco) {
	 this.endereco=endereco;
 }
 
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento=dataNascimento;
}
public abstract String exibirInfo();
}
