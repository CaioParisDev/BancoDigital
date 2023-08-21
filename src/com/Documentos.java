package com;

public class Documentos {
	private static final int tamanhoCPF = 11;
	private static final int tamanhoCNPJ = 14;
	private String nomeCompleto;
	private Nascimento dataNascimento;
	private String numero;
	private String nomeDoPai;
	private String nomeDaMae;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Nascimento getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Nascimento dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getNumero() {
		return numero;
	}

	public int setNumero(String numero) {
		if (this.numero == null || this.numero.isEmpty()) {
			this.numero = new String();
		}
		if (numero.length() == tamanhoCPF) {
			this.numero = numero;
			return 1;
		} else if (numero.length() == tamanhoCNPJ) {
			this.numero = numero;
			return 1;
		} else {
			System.out.println("\nInsira um CPF/CNPJ válido.\n");
			return 0;
		}
	}
	
	public String toString() {
		return "Nome Completo: " + this.nomeCompleto +
				"\nCPF/CNPJ: " + this.numero +
				"\nData de Nascimento: " + this.dataNascimento;
		
	}
	
}