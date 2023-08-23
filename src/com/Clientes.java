package com;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	public enum tipoConta {
		CORRENTE, POUPANCA
	}
	public enum tipoPessoa {
		FISICA, JURIDICA
	}
	Documentos documento;
	List<Enderecos> endereco = new ArrayList<>();
	
	public Clientes(Documentos documento, List<Enderecos> endereco) {
		this.documento = documento;
		this.endereco = endereco;
	}
	
	public List<Enderecos> getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Enderecos obj) {
		endereco.add(obj);
	}
	
	public String toString() {
		return "Nome: " + documento.getNomeCompleto() + "\nCPF/CNPJ: " + documento.getNumero() +
				"\nData de nascimento: " + documento.getDataNascimento() + "\nCEP: ";
	}
}