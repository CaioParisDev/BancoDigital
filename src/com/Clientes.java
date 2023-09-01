package com;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	public enum TipoConta {
		CORRENTE, POUPANCA
	}
	public enum TipoPessoa {
		FISICA, JURIDICA
	}
	
	Documentos documento;
	List<Enderecos> listaEnderecos = new ArrayList<>();
	TipoConta tipoConta;
	TipoPessoa tipoPessoa;
	
	public Clientes() {}
	
	public Clientes(Documentos documento, List<Enderecos> endereco) {
		this.documento = documento;
		this.listaEnderecos = endereco;
	}
	
	public List<Enderecos> getEndereco() {
		return this.listaEnderecos;
	}
	
	public void addEndereco(Enderecos obj) {
		listaEnderecos.add(obj);
	}
	
	public String toString() {
		return "Nome: " + documento.getNomeCompleto() + "\nCPF/CNPJ: " + documento.getNumero() +
				"\nData de nascimento: " + documento.getDataNascimento() + "\nCEP: ";
	}

	public Documentos getDocumento() {
		return documento;
	}

	public void setDocumento(Documentos documento) {
		this.documento = documento;
	}
	
	
}