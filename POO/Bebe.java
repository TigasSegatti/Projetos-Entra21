package bercarioDevJava;

import java.util.ArrayList;
import java.util.Date;

public class Bebe extends Pessoa{

	private Mae mae;
	private Medico medico;
	private ArrayList<ControleMedicamento> ControleMedicamento;
	
	//Construtor
	public Bebe() {}
	public Bebe(String nomeCompleto, String endereco, Date dataNascimento, Mae mae , Medico medico ) {
	super(nomeCompleto, endereco, dataNascimento);
	this.mae = mae;
	this.medico= medico;
	
	}
	
	
	//Métodos para acessar os dados 
	//Getters
	public Mae getMae() {
		return this.mae;
	}
	public Medico getMedico() {
		return this.medico();
	}
	
	public ArrayList<ControleMedicamento> getControleMedicamento(){
		return this.controleMedicamento;
	}
	
	//Setters
	public void setMae(Mae mae) {
		this.mae = mae;
	}
	
	public void setMedico(Medico medico) {
		this.medico=medico;
	}
	public void setControleMedicamento(ArrayList<ControleMedicamento> controleMedicamento) {
		this.controleMedicamento=controleMedicamento;
	}
	
	public String exibirInfo() {
		return String.format("Nome do Bebe: %s\nDa5ta de Nascimento: %s\n"
				+ "%s\nNome da Mãe: %s\nMédcio: %s",this.getNomeCompleto(),
				this.getDataNascimento(),this.getEndereco(),this.mae.getNomeCompleto(),
				this.medico.getNomeCompleto());
	}
	
}
