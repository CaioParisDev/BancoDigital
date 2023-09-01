package com;

public class Documentos {
	private static final int tamanhoCPF = 11;
	private static final int tamanhoCNPJ = 14;
	private String nomeCompleto;
	private Nascimento dataNascimento;
	private String numero;
	

	public Documentos() {
	}

	private Documentos(String nome, Nascimento data, String numero) {
		this.nomeCompleto = nome;
		this.dataNascimento = data;
		this.numero = numero;
		
	}

	public Documentos criarDocumento(String nome, Nascimento data, String numero) {
		return new Documentos(nome, data, numero);
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public boolean setNomeCompleto(String nome) {
		if (nome.length() <= 4) {
			System.out.println("Insira um nome válido.");
			return true;
		} else {
			nomeCompleto = nome;
			return false;
		}
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

	public boolean setNumero(String numero) {
		try {
			if (numero.length() == tamanhoCPF) {
				long numeroFormat = Long.parseLong(numero);
				this.numero = numero;
				return false;

			} else if (numero.length() == tamanhoCNPJ) {
				long numeroFormat = Long.parseLong(numero);
				this.numero = numero;
				return false;

			} else {
				System.out.println("\nInsira um CPF/CNPJ válido.\n");
				return true;
			}
		} catch (Exception e) {
			System.out.println("\nO valor contém letras.\n");
			return true;
		}
	}

	public String toString() {
		return "Nome Completo: " + this.nomeCompleto + "\nCPF/CNPJ: " + this.numero + "\nData de Nascimento: "
				+ this.dataNascimento;

	}

}